package http;

import java.net.URI;
import java.net.http.HttpRequest;
import annotations.WorkInProgress;

@WorkInProgress
public class Get<T> extends AbstractRequest<T>
	{
	@WorkInProgress
	public Get(final URI uri)
		{
		super(uri);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public HttpRequest getHttpRequest()
		{
		return HttpRequest.newBuilder().GET().uri(uri).build();
		}
	}
