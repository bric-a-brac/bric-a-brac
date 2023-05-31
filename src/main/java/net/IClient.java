package net;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpResponse.BodySubscribers;
import java.nio.charset.StandardCharsets;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import util.exceptions.NullArgumentException;

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

	/**
	 * @since 0.1.0
	 */
	public static final BodyHandler<BufferedImage> IMAGE = responseInfo -> null;

	/**
	 * @since 0.1.0
	 */
	public String getUserAgent();

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public default String get(final String url) throws IOException
		{
		return get(URI.create(notNull(url)));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public default String get(URI uri) throws IOException
		{
		return get(uri, TEXT);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public default <T> T get(String url, BodyHandler<T> handler) throws IOException
		{
		return get(URI.create(url), handler);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public <T> T get(URI uri, BodyHandler<T> handler) throws IOException;

	// DEV
	public <T> T send(ISender<T> sender) throws IOException;
	}
