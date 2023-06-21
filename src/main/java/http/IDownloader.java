package http;

import java.io.IOException;
import java.net.URI;
import org.apache.commons.lang3.NotImplementedException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IDownloader<T> //extends FailableFunction<URL, T, IOException>
	{
	public default void download(final String url) throws IOException
		{
		throw new NotImplementedException();
		}

	public default void download(final URI uri) throws IOException
		{
		throw new NotImplementedException();
		}

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
