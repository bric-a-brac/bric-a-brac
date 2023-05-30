package net;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
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

		this.client = notNull(client);
		}

	// HttpClient client = HttpClient.newHttpClient();
	// HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://foo.com/")).build();
	// client.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println).join();

	// HttpClient.newBuilder().connectTimeout(null).followRedirects(Redirect.ALWAYS).build();

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public String get(final URI uri) throws IOException
		{
		final var request = HttpRequest.newBuilder().GET().uri(notNull(uri)).build();

		try
			{
			return client.send(request, BodyHandlers.ofString()).body();
			}
		catch (final InterruptedException ex)
			{
			throw new IOException(ex);
			}
		}

	@Override
	public <T> T get(final URI uri, final IContentHandler<T> handler) throws IOException
		{
		final var request = HttpRequest.newBuilder().GET().uri(notNull(uri)).build();

		try
			{
			return client.send(request, handler).body();
			}
		catch (final InterruptedException ex)
			{
			throw new IOException(ex);
			}
		}
	}
