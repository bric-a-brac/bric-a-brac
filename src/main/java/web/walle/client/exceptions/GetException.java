package web.walle.client.exceptions;

import java.io.IOException;

/**
 * <h4>GetException</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
// TODO: Dans http.client
public final class GetException extends ClientException
	{
	public GetException(final IOException cause)
		{
		super(cause);
		}
	}
