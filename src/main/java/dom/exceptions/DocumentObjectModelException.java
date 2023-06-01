package dom.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class DocumentObjectModelException extends RuntimeException
	{
	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
