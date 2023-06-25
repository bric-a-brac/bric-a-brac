package websitegenerator.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class WebSiteGeneratorException extends Exception
	{
	/**
	 * @since 0.1.0
	 */
	public WebSiteGeneratorException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public WebSiteGeneratorException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public WebSiteGeneratorException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public WebSiteGeneratorException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
