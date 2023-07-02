package http.old;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.BodySubscribers;
import java.nio.charset.StandardCharsets;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IClient
	{
	/**
	 * @since 0.1.0
	 */
	//public static final BodyHandler<byte[]> BYTES = responseInfo -> BodySubscribers.mapping(BodySubscribers.ofString(StandardCharsets.UTF_8), String::getBytes);
	public static final BodyHandler<byte[]> BYTES = BodyHandlers.ofByteArray();

	/**
	 * @since 0.1.0
	 */
	//public static final BodyHandler<String> TEXT = responseInfo -> BodySubscribers.ofString(StandardCharsets.UTF_8);
	public static final BodyHandler<String> TEXT = BodyHandlers.ofString();

	/**
	 * @since 0.1.0
	 */
	public static final BodyHandler<Document> HTML = responseInfo -> BodySubscribers.mapping(BodySubscribers.ofString(StandardCharsets.UTF_8), Jsoup::parse);

	// TODO: HTML parse(html, uri)
	public static final BodyHandler<Document> HTMLbis = responseInfo -> null;

	/**
	 * @since 0.1.0
	 */
	public static final BodyHandler<BufferedImage> IMAGE = responseInfo -> null;

	/**
	 * @since 0.1.0
	 */
	public String getUserAgent();

	}
