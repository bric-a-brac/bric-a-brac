package net;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import org.apache.commons.lang3.NotImplementedException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Client implements IClient, IDownloader<Void>
	{
	protected final HttpClient client;

	/**
	 * @since 0.1.0
	 */
	public Client()
		{
		this(HttpClient.newHttpClient());
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Client(final HttpClient client)
		{
		super();

		// HttpClient.newBuilder().connectTimeout(null).followRedirects(Redirect.ALWAYS).build();
		this.client = notNull(client);
		}

	@Override
	public final String getUserAgent()
		{
		return null;
		}

	@Override
	public void download(String url) throws IOException
		{
		throw new NotImplementedException();
		}

	@Override
	public void download(URI uri) throws IOException
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public <T> T get(final URI uri, final BodyHandler<T> handler) throws IOException
		{
		return execute(getRequest(uri), handler);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	protected HttpRequest getRequest(final URI uri)
		{
		notNull(uri);

		//var sdsd = HttpRequest.newBuilder().GET().uri(uri);
		//sdsd.header("sdsds", null);

		return HttpRequest.newBuilder().GET().uri(uri).build();
		}

	/**
	 * Exécute une requête HTTP.
	 * 
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	protected <T> T execute(final HttpRequest request, final BodyHandler<T> handler) throws IOException
		{
		notNull(request);
		notNull(handler);

		try
			{
			return client.send(request, handler).body();
			}
		catch (final InterruptedException ex)
			{
			// TODO: Autre erreur ???
			throw new IOException(ex);
			}
		}
	}
