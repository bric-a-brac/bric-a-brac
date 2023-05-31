package zip;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import io.IO;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class ZipArchive implements AutoCloseable
	{
	protected final FileSystem zip;

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public ZipArchive(final Path path) throws IOException
		{
		super();

		// TODO: Meilleur gestion erreurs...
		/*
		try
			{
			zip = FileSystems.newFileSystem(IO.REAL.apply(path));
			}
		catch (final ZipException ex)
			{
			throw new ZipArchiveException(ex);
			}
		catch (final ProviderNotFoundException ex)
			{
			throw new InvalidZipArchiveException(ex);
			}
		*/

		zip = FileSystems.newFileSystem(IO.REAL.apply(path));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public ZipArchive(final File file) throws IOException
		{
		this(IO.toPath(file));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public ZipArchive(final String path) throws IOException
		{
		this(IO.toPath(path));
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public void close() throws IOException
		{
		zip.close();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final String read(final Path path) throws IOException
		{
		// Attention: path doit être pris depuis zip.getPath() !! C'est pour ça final

		if (notNull(path).getFileSystem().equals(zip))
			{
			// OK path est déjà un chemin dans l'archive on peut le lire
			return Files.readString(path);
			}

		// Convertir en chemin de l'archive et rééssayer
		return read(zip.getPath(path.toString()));
		}
	}
