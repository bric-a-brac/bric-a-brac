package net;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import org.jsoup.nodes.Document;
import util.exceptions.NullArgumentException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class SimpleClient extends Client
	{
	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public BufferedImage getAsImage(final URI uri) throws IOException
		{
		return get(uri, IMAGE);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Document getAsDocument(final URI uri) throws IOException
		{
		return get(uri, HTML);
		}

	/*
	public static final Timeout TIMEOUT_TWO_SECONDS = Timeout.of(2L, TimeUnit.SECONDS);
	public static final Timeout TIMEOUT_FIVE_SECONDS = Timeout.of(5L, TimeUnit.SECONDS);
	public static final Timeout TIMEOUT_TEN_SECONDS = Timeout.of(10L, TimeUnit.SECONDS);

	protected final String userAgent;

	protected Timeout connectTimeout = null;
	protected Timeout responseTimeout = null;

	public SimpleClient()
		{
		// TODO
		this(Constant.BRIC_A_BRAC_USER_AGENT);

		throw new NotImplementedException("TODO Constant.BRIC_A_BRAC_USER_AGENT");
		}

	public SimpleClient(final String userAgent)
		{
		this(userAgent, false);
		}

	public SimpleClient(final String userAgent, final boolean withTimeout)
		{
		super();

		this.userAgent = notNull(userAgent);

		if (withTimeout)
			{
			connectTimeout = TIMEOUT_TWO_SECONDS;
			responseTimeout = TIMEOUT_FIVE_SECONDS;
			}
		}

	public final <T> T get(final String url, final FailableFunction<Response, T, IOException> handler) throws IOException
		{
		return execute(Request.get(notNull(url)), handler);
		}

	public final <T> T get(final URI uri, final FailableFunction<Response, T, IOException> handler) throws IOException
		{
		return execute(Request.get(notNull(uri)), handler);
		}

	public final String getAsString(final String url) throws IOException
		{
		return get(url, text());
		}

	public final String getAsString(final URI uri) throws IOException
		{
		return get(uri, text());
		}

	public final Document getAsDocument(final String url) throws IOException
		{
		return get(url, text().andThen(html(url)));
		}

	public final Document getAsDocument(final URI uri) throws IOException
		{
		return get(uri, text().andThen(html(uri.toURL().toString())));
		}

	protected IOException onHttpResponseException(final HttpResponseException exception)
		{
		return exception;
		}

	protected final <T> T execute(final Request request, final FailableFunction<Response, T, IOException> handler) throws IOException
		{
		notNull(request);
		notNull(handler);

		request.userAgent(userAgent);

		if (connectTimeout != null)
			{
			request.connectTimeout(connectTimeout);
			}

		if (responseTimeout != null)
			{
			request.responseTimeout(responseTimeout);
			}

		try
			{
			return handler.apply(request.execute());
			}
		catch (final HttpResponseException ex)
			{
			throw onHttpResponseException(ex);
			}
		}

	public static final FailableFunction<Response, String, IOException> text()
		{
		return response -> response.returnContent().asString(StandardCharsets.UTF_8);
		}

	public static final FailableFunction<String, Document, IOException> html(final String url)
		{
		return html -> Parser.parse(url, html);
		}
	*/
	}
