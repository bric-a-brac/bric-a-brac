package util;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import util.exceptions.EmptyArgumentException;
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

	/**
	 * @throws NullArgumentException
	 * @throws EmptyArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final CharSequence notEmpty(final CharSequence argument)
		{
		notNull(argument);

		if (argument.isEmpty())
			{
			throw new EmptyArgumentException();
			}

		return argument;
		}

	/**
	 * @throws NullArgumentException
	 * @throws EmptyArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final String notEmpty(final String argument)
		{
		notNull(argument);

		if (argument.isEmpty())
			{
			throw new EmptyArgumentException();
			}

		return argument;
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
