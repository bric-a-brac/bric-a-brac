package zim.exceptions;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class ZimException extends IOException
	{
	/**
	 * @since 0.1.0
	 */
	public ZimException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public ZimException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public ZimException(final Throwable throwable)
		{
		super(throwable);
		}

	/**
	 * @since 0.1.0
	 */
	public ZimException(final String message, final Throwable throwable)
		{
		super(message, throwable);
		}
	}
