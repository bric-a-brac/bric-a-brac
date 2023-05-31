package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import org.apache.commons.lang3.function.FailableFunction;
import util.Constant;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class IO
	{
	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<String, File, IOException> STRING_TO_FILE = IO::toFile;

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<Path, File, IOException> PATH_TO_FILE = IO::toFile;

	public static final FailableFunction<Path, Path, IOException> REAL = path -> notNull(path).toAbsolutePath().normalize().toRealPath();

	//public static final FailableFunction<Path, File, RuntimeException> PATH_TO_FsddILE = STRING_TO_FILE.andThen(null);

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 * 
	 * @see https://www.baeldung.com/java-file-extension
	 */
	public static final Optional<String> getExtension(final Path path)
		{
		final var filename = notNull(path).getFileName().toString();

		return Optional.of(filename)
			.filter(text -> text.contains(Constant.DOT))
			.map(text -> text.substring(filename.lastIndexOf(Constant.DOT) + 1));
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final File toFile(final String path)
		{
		return new File(notNull(path));
		}

	/**
	 * @throws NullArgumentException
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public static final File toFile(final Path path)
		{
		return notNull(path).toFile();
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final Path toPath(final String path)
		{
		// TODO: Ou Path.of() ???
		return Paths.get(notNull(path));
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final Path toPath(final File file)
		{
		return notNull(file).toPath();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> T read(final File file, final IObjectReader<T> reader) throws IOException
		{
		notNull(file);
		notNull(reader);

		try (final var stream = new FileInputStream(file))
			{
			try (final var input = new ObjectInputStream(stream))
				{
				try
					{
					return reader.read(input);
					}
				catch (final ReflectiveOperationException ex)
					{
					throw new IOException(ex);
					}
				}
			}
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> T read(final String path, final IObjectReader<T> reader) throws IOException
		{
		return read(toFile(path), reader);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	//@SuppressWarnings("unchecked")
	public static final Object read(final File file) throws IOException
		{
		return read(file, reader -> reader.readObject());

		/*
		return (T) read(toFile(path), reader ->
			{
			return reader.readObject();
			});
		*/
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final Object read(final String path) throws IOException
		{
		return read(toFile(path));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final void write(final File file, final IObjectWriter writer) throws IOException
		{
		notNull(file);
		notNull(writer);

		try (final var stream = new FileOutputStream(file))
			{
			try (final var output = new ObjectOutputStream(stream))
				{
				writer.write(output);
				}
			}
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final void write(final String path, final IObjectWriter writer) throws IOException
		{
		write(toFile(path), writer);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> void write(final File file, final T data) throws IOException
		{
		write(file, writer -> writer.writeObject(data));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> void write(final String path, final T data) throws IOException
		{
		write(toFile(path), data);
		}
	}
