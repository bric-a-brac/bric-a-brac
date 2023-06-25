package websitegenerator.engine.exceptions;

import websitegenerator.exceptions.WebSiteGeneratorException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class EngineException extends WebSiteGeneratorException
	{
	/**
	 * @since 0.1.0
	 */
	public EngineException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public EngineException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public EngineException(final Throwable cause)
		{
		super(cause);
		}

	/**
	 * @since 0.1.0
	 */
	public EngineException(final String message, final Throwable cause)
		{
		super(message, cause);
		}
	}
