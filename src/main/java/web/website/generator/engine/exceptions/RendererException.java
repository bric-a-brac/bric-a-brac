package web.website.generator.engine.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class RendererException extends EngineException
	{
	/**
	 * @since 0.1.0
	 */
	public RendererException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public RendererException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public RendererException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public RendererException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
