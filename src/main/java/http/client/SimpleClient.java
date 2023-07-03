package http.client;

import java.net.URI;
import org.apache.commons.lang3.NotImplementedException;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;

@WorkInProgress
public class SimpleClient extends Client
	{
	public String getAsString(final URI uri)
		{
		return get(new Get<>(uri, new AsString())).getContent();
		}

	public Document getAsDocument(final URI uri)
		{
		return get(new Get<>(uri, new AsDocument())).getContent();
		}

	@Override
	public <T> IResponse<T> get(final IRequest.IGet<T> request)
		{
		return send(request);
		}

	@Override
	@WorkInProgress
	public <T> IResponse<T> send(final IRequest<T> request)
		{
		try
			{
			super.send(request);
			}
		catch (Exception e)
			{
			}

		throw new NotImplementedException();
		}
	}
