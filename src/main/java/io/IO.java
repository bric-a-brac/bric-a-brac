package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class IO
	{
	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@SuppressWarnings("unchecked")
	public static final <T> T read(final File file) throws IOException
		{
		notNull(file);

		try (final var stream = new FileInputStream(file))
			{
			try (final var input = new ObjectInputStream(stream))
				{
				return (T) input.readObject();
				}
			catch (final ClassNotFoundException ex)
				{
				throw new IOException(ex);
				}
			}
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> T read(final String path) throws IOException
		{
		return read(new File(notNull(path)));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> void write(final File file, T data) throws IOException
		{
		notNull(file);
		notNull(data);

		try (final var stream = new FileOutputStream(file))
			{
			try (final var output = new ObjectOutputStream(stream))
				{
				output.writeObject(data);
				}
			}
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> void write(final String path, T data) throws IOException
		{
		write(new File(notNull(path)), data);
		}
	}
