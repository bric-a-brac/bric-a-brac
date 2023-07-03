package api;

import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import http.client.AsJSON;
import http.client.Client;
import http.client.Get;

@WorkInProgress
public abstract class AbstractAPI extends Client implements API
	{
	@WorkInProgress
	public AbstractAPI()
		{
		super();
		}

	@Override
	@WorkInProgress
	public <T> IEndPoint<T> getEndPoint(final Class<T> classOfT)
		{
		return new EndPoint<T>();
		}

	@WorkInProgress
	protected class EndPoint<T> implements IEndPoint<T>
		{
		@Override
		@WorkInProgress
		public T get() throws IOException
			{
			try
				{
				AbstractAPI.this.get(new Get<T>(URI.create("ass"), new AsJSON<T>(null)));
				}
			catch (final InterruptedException ex)
				{
				}

			throw new NotImplementedException();
			}

		@Override
		@WorkInProgress
		public Collection<T> getAll() throws IOException
			{
			throw new NotImplementedException();
			}
		}
	}
