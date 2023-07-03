package http.client;

import java.io.IOException;
import java.net.http.HttpClient;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public abstract class AbstractClient implements IClient
	{
	protected final HttpClient client;

	public AbstractClient()
		{
		super();

		client = HttpClient.newHttpClient();
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

		client.send(request.getHttpRequest(), null);

		throw new NotImplementedException();
		}
	}
