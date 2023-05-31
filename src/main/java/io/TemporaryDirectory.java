package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import util.Constant;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class TemporaryDirectory
	{
	protected final Path directory;

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public TemporaryDirectory() throws IOException
		{
		this(null);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public TemporaryDirectory(final Path path) throws IOException
		{
		super();

		this.directory = check(path);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final Path createTemporaryFile(final String extension, final boolean deleteOnExit) throws IOException
		{
		notNull(extension);

		final Path path = (directory == null) ? Files.createTempFile(null, extension) : Files.createTempFile(directory, null, extension);

		if (deleteOnExit)
			{
			path.toFile().deleteOnExit();
			}

		return path;
		}

	/**
	 * @since 0.1.0
	 */
	public final Path createTemporaryFile(final String extension) throws IOException
		{
		return createTemporaryFile(extension, true);
		}

	/**
	 * Créer un fichier temporaire avec l'extension .tmp qui sera supprimé à la fermeture de l'application.
	 * 
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final Path createTemporaryFile() throws IOException
		{
		return new TemporaryDirectory().createTemporaryFile(Constant.TMP);
		}

	/**
	 * Vérifier que le chemin soit bien un dossier.
	 * 
	 * @throws FileNotFoundException
	 * @throws NotDirectoryException
	 * 
	 * @since 0.1.0
	 */
	private static final Path check(final Path path) throws IOException
		{
		if (path != null)
			{
			if (!Files.exists(path))
				{
				throw new FileNotFoundException(path.toString());
				}

			if (!Files.isDirectory(path))
				{
				throw new NotDirectoryException(path.toString());
				}
			}

		return path;
		}
	}
