package dom.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class DocumentObjectModelParseException extends DocumentObjectModelException
	{
	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelParseException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelParseException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelParseException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public DocumentObjectModelParseException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
