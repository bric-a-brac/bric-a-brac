package walle;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.apache.commons.lang3.function.FailableBiFunction;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import html.Parser;

import static util.Argument.notNull;

@WorkInProgress
public class Client extends Parser
	{
	private static final HttpClient CLIENT;

	static
		{
		CLIENT = HttpClient.newBuilder()
			.version(Version.HTTP_1_1)
			.followRedirects(Redirect.ALWAYS)
			.connectTimeout(Duration.ofSeconds(20L))
			//.authenticator(Authenticator.getDefault())
			.build();
		}

	public static final BiFunction<String, URI, Document> PARSE = (html, uri) -> parse(html, uri.toString());

	//public final Function<String, String> A = this::a;
	public final BiFunction<String, String, Document> B = this::b;
	public final Function<Document, List<String>> C = this::c;

	public final BiFunction<String, String, List<String>> D = B.andThen(C);

	public final String a(String url)
		{
		url = "modifié";
		return "<html>A B C</html>";
		}

	public final Document b(final String url, final String html)
		{
		return parse(html, url);
		}

	public final List<String> c(final Document document)
		{
		return words(document);
		}

	public final void d()
		{
		var url = "https://www.ritzy.ch/";

		final var html = a(url);

		final var keywords = D.apply(url, html);

		System.out.println(keywords);
		}

	public static final String get(URI uri)
		{
		notNull(uri);

		final var request = HttpRequest.newBuilder().GET().uri(uri).build();

		try
			{
			final var response = CLIENT.send(request, BodyHandlers.ofString());

			// Au cas ou il y a une redirection
			uri = response.uri();

			//System.out.println(response.statusCode());

			return response.body();
			}
		catch (final IOException io)
			{
			throw new UncheckedIOException(io);
			}
		catch (final InterruptedException interupt)
			{
			throw new UncheckedIOException(new IOException(interupt));
			}
		}

	public static final void get(final String url, final BiConsumer<String, String> consumer)
		{
		notNull(url);
		notNull(consumer);

		try
			{
			var uri = URI.create(url);

			final var html = get(uri);

			consumer.accept(html, uri.toString());
			}
		catch (final IllegalArgumentException | UncheckedIOException ex)
			{
			}
		}

	public static final <T> T get(final String url, final BiFunction<String, URI, T> mapper)
		{
		notNull(url);
		notNull(mapper);

		try
			{
			var uri = URI.create(url);

			final var html = get(uri);

			return mapper.apply(html, uri);
			}
		catch (final IllegalArgumentException | UncheckedIOException ex)
			{
			return null;
			}
		}

	public static final Optional<Document> get(final String url)
		{
		return Optional.ofNullable(get(url, PARSE));
		}

	public static final <T> T get(URI uri, final BiFunction<URI, String, T> mapper) throws IOException
		{
		return null;
		}

		
	}
