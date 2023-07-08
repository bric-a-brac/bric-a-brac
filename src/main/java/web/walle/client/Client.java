package web.walle.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import html.Parser;
import web.walle.client.exceptions.GetException;
import wip.HTTP;

@WorkInProgress
public final class Client
	{
	private static final String USER_AGENT = "WallE/0.1.0";

	private final HttpClient client;

	public Client()
		{
		super();

		client = HttpClient.newBuilder()
			.version(Version.HTTP_1_1)
			.connectTimeout(Duration.ofSeconds(10L))
			.followRedirects(Redirect.ALWAYS)
			.build();
		}

	/*
	@WorkInProgress
	public HttpResponse<String> get(final String url)
		{
		try
			{
			final var request = getHttpRequest(url);

			final var response = client.send(request, BodyHandlers.ofString());

			if (response.statusCode() < 400)
				{
				// Si il y a eu des redirections (!!! il faut définir followRedirects)
				System.out.println(response.uri());
				}

			return response;
			}
		catch (final IOException | InterruptedException ex)
			{
			throw new GetException();
			}
		}
	*/

	@WorkInProgress
	public Document get(final String url)
		{
		try
			{
			final var request = getHttpRequest(url);

			final var response = client.send(request, BodyHandlers.ofString());

			if (response.statusCode() < 400)
				{
				// Si il y a eu des redirections (!!! il faut définir followRedirects)
				// TODO: toASCIIString() ???
				final var uri = response.uri().toString();
				final var html = response.body();

				return Parser.parse(html, uri);
				}

			// TODO: Message
			throw new GetException(/* statusCode > 400 */);
			}
		catch (final IOException | InterruptedException ex)
			{
			throw new GetException();
			}
		}

	@WorkInProgress
	private HttpRequest getHttpRequest(final String url)
		{
		var builder = HttpRequest.newBuilder().GET().uri(URI.create(url));

		builder = HTTP.addUserAgent(builder, USER_AGENT);

		return builder.build();
		}
	}
