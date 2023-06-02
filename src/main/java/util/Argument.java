package util;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;

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

	/**
	 * @throws NotStrictlyPositiveException
	 * 
	 * @since 0.1.0
	 */
	public static void strictlyPositive(final int value)
		{
		if (value <= 0)
			{
			throw new NotStrictlyPositiveException(Integer.valueOf(value));
			}
		}
	}
