package util.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class NullArgumentException extends IllegalArgumentException
	{
	/**
	 * @since 0.1.0
	 */
	public NullArgumentException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public NullArgumentException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public NullArgumentException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public NullArgumentException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
