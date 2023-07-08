package wip;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.BodySubscribers;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import image.IImage;

import static util.Argument.notNull;

@WorkInProgress
public class HTTP
	{
	public static final String USER_AGENT = "User-Agent";

	public static final BodyHandler<String> ISO_8859_1_TO_UTF_8 = responseInfo -> ofString(StandardCharsets.ISO_8859_1, StandardCharsets.UTF_8);

	/**
	 * @throws NullArgumentException
	 */
	@WorkInProgress
	public static final HttpRequest.Builder addUserAgent(final HttpRequest.Builder builder, final String userAgent)
		{
		notNull(builder);
		notNull(userAgent);

		return builder.header(USER_AGENT, userAgent);
		}

	/**
	 * @throws NullArgumentException
	 */
	public static final BodySubscriber<String> ofString(final Charset from, final Charset to)
		{
		notNull(from);
		notNull(to);

		return BodySubscribers.mapping(BodySubscribers.ofString(from), body -> new String(body.getBytes(from), to));
		}

	public static final BodyHandler<byte[]> BYTES = BodyHandlers.ofByteArray();

	public static final BodyHandler<String> TEXT = BodyHandlers.ofString();

	/**
	 * @since 0.1.0
	 */
	public static final BodySubscriber<Document> ofDocument()
		{
		// FIXME: Pas UTF8 mais ofString() comme ça prends encodage depuis headers
		return ofDocument(StandardCharsets.UTF_8);
		}

	/**
	 * @since 0.1.0
	 */
	public static final BodySubscriber<Document> ofDocument(final Charset charset)
		{
		notNull(charset);

		return BodySubscribers.mapping(BodySubscribers.ofString(charset), html -> Jsoup.parse(html));
		}

	/**
	 * @since 0.1.0
	 */
	public static final BodyHandler<Document> HTML = responseInfo -> ofDocument();
	// TODO: URL final
	//public static final BodyHandler<Document> HTML = responseInfo -> BodySubscribers.mapping(BodySubscribers.ofString(StandardCharsets.UTF_8), Jsoup::parse);

	/**
	 * @since 0.1.0
	 */
	public static final BodySubscriber<BufferedImage> ofImage()
		{
		return BodySubscribers.mapping(BodySubscribers.ofInputStream(), HTTP::asImage);
		}

	/**
	 * @since 0.1.0
	 */
	public static final BodyHandler<BufferedImage> IMAGE = responseInfo -> ofImage();

	/**
	 * @since 0.1.0
	 */
	private static final BufferedImage asImage(final InputStream input)
		{
		try
			{
			return IImage.INPUT_STREAM_READER.apply(input);
			}
		catch (final IOException ex)
			{
			throw new UncheckedIOException(ex);
			}
		}

	/**
	 * @since 0.1.0
	 */
	public static final BodySubscriber<String> dfdf(final Charset charset)
		{
		notNull(charset);

		//CSVParser.parse()
		BodySubscribers.mapping(BodySubscribers.ofInputStream(), null);
		return BodySubscribers.mapping(BodySubscribers.ofString(charset), null);
		}
	}
