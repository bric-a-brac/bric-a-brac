package web.walle.client.exceptions;

import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * <h4>ClientException</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
// TODO: Dans http.client
public class ClientException extends UncheckedIOException
	{
	public ClientException(final IOException cause)
		{
		super(cause);
		}

	public ClientException(final String message, final IOException cause)
		{
		super(message, cause);
		}
	}
