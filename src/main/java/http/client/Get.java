package http.client;

import java.net.URI;
import java.net.http.HttpRequest;
import annotations.WorkInProgress;

@WorkInProgress
public class Get<T> extends AbstractRequest<T> implements IRequest.IGet<T>
	{
	public Get(final URI uri, IContentHandler<T> handler)
		{
		super(uri, handler);
		}

	@Override
	@WorkInProgress
	public HttpRequest getHttpRequest()
		{
		//return HttpRequest.newBuilder().GET().uri(uri).build();
		return null;
		}
	}
