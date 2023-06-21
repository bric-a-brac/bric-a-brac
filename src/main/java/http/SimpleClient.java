package http;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.nodes.Document;

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
	public Document getAsDocument(final String url) throws IOException
		{
		return get(url, HTML);
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
	}
