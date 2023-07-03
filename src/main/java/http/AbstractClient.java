package http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public abstract class AbstractClient //implements IClient
	{
	protected final HttpClient client;

	@WorkInProgress
	public AbstractClient()
		{
		super();

		client = HttpClient.newHttpClient();
		}

	//@Override
	@WorkInProgress
	public final <T> IResponse<T> send(final IRequest<T> request) throws IOException, InterruptedException
		{
		notNull(request);

		@SuppressWarnings("unused")
		final var response = client.send(request.getHttpRequest(), request.getBodyHandler());

		throw new NotImplementedException();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IllegalArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final URI uriFromString(final String uri)
		{
		return URI.create(notNull(uri));
		}
	}
