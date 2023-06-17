package util;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;

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
	public static final int strictlyPositive(final int value)
		{
		if (value <= 0)
			{
			throw new NotStrictlyPositiveException(Integer.valueOf(value));
			}

		return value;
		}

	/**
	 * @throws NumberIsTooLargeException
	 * 
	 * @since 0.1.0
	 */
	public static final int smallerThan(final int value, final int max)
		{
		if (value > max)
			{
			throw new NumberIsTooLargeException(Integer.valueOf(value), Integer.valueOf(max), true);
			}

		return value;
		}
	}
