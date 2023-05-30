package image.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class InvalidImageException extends ImageException
	{
	/**
	 * @since 0.1.0
	 */
	public InvalidImageException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidImageException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidImageException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidImageException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
