package io.old;

import java.io.IOException;
import org.apache.commons.lang3.NotImplementedException;
import io.IStringInput;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class StandardInput implements IStringInput
	{
	/**
	 * @since 0.1.0
	 */
	@Override
	public final String get() throws IOException
		{
		/*
		final var dontCloseReader = new InputStreamReader(System.in)
			{
			@Override
			public void close() throws IOException
				{
				//super.close();
				}
			};
		*/

		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	public static final String readLine() throws IOException
		{
		final var stdin = System.in;

		final var line = new StringBuilder();

		do
			{
			line.append(Character.toString(stdin.read()));
			}
		while (stdin.available() > 0);

		return line.toString();
		}

	/**
	 * @since 0.1.0
	 */
	/*
	public static final String read() throws IOException
		{
		// TODO: Besoin ou pas ???
		if (System.in.available() == 0)
			{
			return null;
			}

		return IO.read(System.in);
		}
	*/

	/*
	private static final class sdsd extends InputStream
		{
			InputStreamReader
		}
	*/
	}
