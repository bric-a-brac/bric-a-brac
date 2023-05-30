package image.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class InvalidImageSizeException extends InvalidImageException
	{
	/**
	 * @since 0.1.0
	 */
	public InvalidImageSizeException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidImageSizeException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidImageSizeException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public InvalidImageSizeException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
