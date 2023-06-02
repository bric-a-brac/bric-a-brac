package io.old;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import org.apache.commons.lang3.NotImplementedException;

import static util.Argument.notNull;

public class OldIO
	{
	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final void write(final InputStream input, final File file) throws IOException
		{
		notNull(input);
		notNull(file);

		// TODO: Ou try (final var output = new FileOutputStream(path.toFile())) ????

		try (final var reader = new InputStreamReader(input))
			{
			try (final var output = new FileWriter(file))
				{
				reader.transferTo(output);
				}
			}
		}

	public static final void write(final InputStream input, final Path path) throws IOException
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	/*
	public static final String read(final InputStream input) throws IOException
		{
		try (final var reader = new BufferedReader(new InputStreamReader(notNull(input))))
			{
			try (final var writer = new StringWriter())
				{
				reader.transferTo(writer);

				return writer.toString();
				}
			}
		}
	*/
	}
