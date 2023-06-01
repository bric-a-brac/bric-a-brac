package parser.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class InvalidDateException extends ParseException
	{
	/**
	 * @since 0.1.0
	 */
	public InvalidDateException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidDateException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidDateException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidDateException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
