package http.client;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import util.exceptions.NullArgumentException;

@WorkInProgress
public abstract class SimpleClient<T> extends Client implements ISimpleClient<T>
	{
	@Override
	@WorkInProgress
	public T get(final URI uri)
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws NullArgumentException
	 * @throws UncheckedIOException
	 */
	@Override
	public <R> IResponse<R> send(final IRequest<R> request)
		{
		try
			{
			return super.send(request);
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

	@WorkInProgress
	public static class Text extends SimpleClient<String>
		{
		@Override
		@WorkInProgress
		public String get(final URI uri)
			{
			send(new Get<String>(uri, null));

			throw new NotImplementedException();
			}
		}

	@WorkInProgress
	public static class Image extends SimpleClient<BufferedImage>
		{
		}

	@WorkInProgress
	public static class Document extends SimpleClient<org.jsoup.nodes.Document>
		{
		}
	}
