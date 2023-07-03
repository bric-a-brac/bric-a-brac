package http;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jsoup.nodes.Document;
import util.Argument;
import util.exceptions.EmptyArgumentException;
import util.exceptions.NullArgumentException;
import wip.HTTP;

public class StaticClient
	{
	public static String getAsString(final String uri)
		{
		return get(uri, HTTP.TEXT).body();
		}

	public static Document getAsDocument(final String uri)
		{
		return get(uri, HTTP.HTML).body();
		}

	public static <T> T getAsDocument(final String uri, final Function<Document, T> mapper)
		{
		Argument.notNull(mapper);

		return mapper.apply(getAsDocument(uri));
		}

	public static void getAsDocument(final String uri, final Consumer<Document> consumer)
		{
		Argument.notNull(consumer);

		consumer.accept(getAsDocument(uri));
		}

	/**
	 * @throws NullArgumentException
	 * @throws EmptyArgumentException
	 * @throws UncheckedIOException
	 */
	public static <T> HttpResponse<T> get(final String uri, final HttpResponse.BodyHandler<T> handler)
		{
		Argument.notEmpty(uri);
		Argument.notNull(handler);

		final var client = HttpClient.newHttpClient();

		final var request = HttpRequest.newBuilder(URI.create(uri)).GET().build();

		try
			{
			return client.send(request, handler);
			}
		catch (final IOException ex)
			{
			throw new UncheckedIOException(ex);
			}
		catch (final InterruptedException ex)
			{
			throw new UncheckedIOException(new IOException(ex));
			}
		}

	/*
	public static void main(String[] args)
		{
		//System.out.println(get(URI.create("https://example.net/")));
		//System.out.println(getAsDocument(URI.create("https://example.net/")).getClass().getCanonicalName());
		//System.out.println(getAsImage(URI.create("https://static1.cbrimages.com/wordpress/wp-content/uploads/2021/02/Balrog-Gandalf.jpg")));
		}
	*/
	}
