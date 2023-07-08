package web.website.generator.engine.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class RenderException extends RendererException
	{
	/**
	 * @since 0.1.0
	 */
	public RenderException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public RenderException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public RenderException(final Throwable throwable)
		{
		super(throwable);
		}
	}
