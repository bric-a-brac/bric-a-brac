package http;

import java.net.URI;
import java.net.http.HttpResponse.BodyHandler;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public abstract class AbstractRequest<T> implements IRequest<T>
	{
	protected final URI uri;
	//protected final IContentHandler<T> handler;

	@WorkInProgress
	public AbstractRequest(final URI uri)
		{
		super();

		this.uri = notNull(uri);
		//this.handler = notNull(handler);
		}

	/**
	 * @since 0.1.0
	 */
	/*
	@Override
	public final URI getURI()
		{
		return uri;
		}
	*/

	/**
	 * @since 0.1.0
	 */
	/*
	@Override
	public final IContentHandler<T> getContentHandler()
		{
		return handler;
		}
	*/

	@Override
	@WorkInProgress
	public final BodyHandler<T> getBodyHandler()
		{
		throw new NotImplementedException();
		}
	}
