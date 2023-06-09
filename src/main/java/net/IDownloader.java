package net;

import java.io.IOException;
import java.net.URI;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IDownloader<T> //extends FailableFunction<URL, T, IOException>
	{
	public void download(final String url) throws IOException;

	public void download(final URI uri) throws IOException;

	/*
	public default T download(final String url) throws IOException
		{
		return apply(new URL(notNull(url)));
		}
	*/

	/*
	public default T download(final URL url) throws IOException
		{
		return apply(notNull(url));
		}
	*/
	}
