package opendocument.exceptions;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class OpenDocumentException extends IOException
	{
	/**
	 * @since 0.1.0
	 */
	public OpenDocumentException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public OpenDocumentException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public OpenDocumentException(final Throwable throwable)
		{
		super(throwable);
		}

	/**
	 * @since 0.1.0
	 */
	public OpenDocumentException(final String message, final Throwable throwable)
		{
		super(message, throwable);
		}
	}
