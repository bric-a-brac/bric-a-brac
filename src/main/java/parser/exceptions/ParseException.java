package parser.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class ParseException extends IllegalArgumentException
	{
	/**
	 * @since 0.1.0
	 */
	public ParseException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public ParseException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public ParseException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public ParseException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
