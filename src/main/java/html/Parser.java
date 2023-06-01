package html;

import parser.IParser;
import util.exceptions.NullArgumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Parser implements IParser<String, Document, RuntimeException>
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final Document apply(final String html)
		{
		notNull(html);

		return Jsoup.parse(html);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final Document parse(final String url, final String html)
		{
		notNull(url);
		notNull(html);

		return Jsoup.parse(html, url);
		}
	}
