package http.client;

import java.net.URI;
import java.net.http.HttpResponse.BodyHandler;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public abstract class AbstractRequest<T> implements IRequest<T>
	{
	protected final URI uri;

	@WorkInProgress
	public AbstractRequest(final URI uri, final IContentHandler<T> handler)
		{
		super();

		this.uri = notNull(uri);
		}

	/*
	@Override
	public final URI getURI()
		{
		return uri;
		}
	*/

	@Override
	public final BodyHandler<T> getBodyHandler()
		{
		throw new NotImplementedException();
		}
	}
