package util;

import util.exceptions.NullArgumentException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Argument
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> T notNull(final T value)
		{
		if (value == null)
			{
			throw new NullArgumentException();
			}

		return value;
		}
	}
