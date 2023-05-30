package net;

import java.io.IOException;
import java.net.URI;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IClient
	{
	//public String getUserAgent();

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
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public String get(URI uri) throws IOException;

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public <T> T get(URI uri, IContentHandler<T> handler) throws IOException;
	}
