package http;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URI;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public class SimpleClient extends Client implements ISimpleClient
	{
	/**
	 * @throws NullArgumentException
	 * @throws IllegalArgumentException
	 * @throws UncheckedIOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final String getAsString(final URI uri)
		{
		return sendUnchecked(new Get<String>(uri));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IllegalArgumentException
	 * @throws UncheckedIOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final String getAsString(final String uri)
		{
		return getAsString(uriFromString(uri));
		}

	@Override
	@WorkInProgress
	public Document getAsDocument(final URI uri)
		{
		//send2(new Get<Document>());

		throw new NotImplementedException();
		}

	@Override
	public final Document getAsDocument(final String uri)
		{
		return getAsDocument(uriFromString(uri));
		}

	@Override
	@WorkInProgress
	public BufferedImage getAsImage(final URI uri)
		{
		//send2(new Get<BufferedImage>());

		throw new NotImplementedException();
		}

	@Override
	public final BufferedImage getAsImage(final String uri)
		{
		return getAsImage(uriFromString(uri));
		}

	/**
	 * @throws UncheckedIOException
	 * 
	 * @since 0.1.0
	 */
	protected <T> T sendUnchecked(final IRequest<T> request)
		{
		try
			{
			return send(request).getContent();
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
	}
