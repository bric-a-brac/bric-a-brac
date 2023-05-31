package zip.exceptions;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
public class ZipArchiveException extends IOException
	{
	/**
	 * @since 0.1.0
	 */
	public ZipArchiveException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public ZipArchiveException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public ZipArchiveException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public ZipArchiveException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
