package web.website.generator.engine.exceptions;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
public abstract class TemplateEngineException extends EngineException
	{
	/**
	 * @since 0.1.0
	 */
	public TemplateEngineException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public TemplateEngineException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public TemplateEngineException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public TemplateEngineException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
