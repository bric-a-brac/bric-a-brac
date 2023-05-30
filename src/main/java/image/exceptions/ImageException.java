package image.exceptions;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class ImageException extends IOException
	{
	/**
	 * @since 0.1.0
	 */
	public ImageException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public ImageException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public ImageException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public ImageException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
