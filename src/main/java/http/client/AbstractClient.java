package http.client;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse.BodyHandlers;

import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

@WorkInProgress
public abstract class AbstractClient implements IClient
	{
	protected final HttpClient client;

	/**
	 * @since 0.1.0
	 */
	public AbstractClient()
		{
		this(HttpClient.newHttpClient());
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public AbstractClient(final HttpClient client)
		{
		super();

		this.client = notNull(client);
		}

	@Override
	@WorkInProgress
	public <T> IResponse<T> get(final IRequest.IGet<T> request) throws IOException, InterruptedException
		{
		throw new NotImplementedException();
		}

	@Override
	@WorkInProgress
	public <T> IResponse<T> post(final IRequest.IPost<T> request) throws IOException, InterruptedException
		{
		throw new NotImplementedException();
		}

	@Override
	@WorkInProgress
	public <T> IResponse<T> put(final IRequest.IPut<T> request) throws IOException, InterruptedException
		{
		throw new NotImplementedException();
		}

	@Override
	@WorkInProgress
	public <T> IResponse<T> delete(final IRequest.IDelete<T> request) throws IOException, InterruptedException
		{
		throw new NotImplementedException();
		}

	@Override
	@WorkInProgress
	public <T> IResponse<T> send(final IRequest<T> request) throws IOException, InterruptedException
		{
		notNull(request);

		@SuppressWarnings("unused")
		final var response = client.send(request.getHttpRequest(), request.getBodyHandler());

		// Au cas ou il y a une redirection
		// TODO: uri = response.uri();

		throw new NotImplementedException();
		}
	}
