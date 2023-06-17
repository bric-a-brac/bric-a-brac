package web;

import java.util.List;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.nodes.Document;
import html.IExtractor;
import html.Parser;

import static util.Argument.notNull;

/**
 * <h4>Page Web</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class WebPage implements IWebPage
	{
	protected final Document document;
	protected final String html;
	protected final String url;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public WebPage(final String url, final String html)
		{
		super();

		notNull(url);
		notNull(html);

		this.url = notNull(url);
		this.html = notNull(html);

		document = Parser.parse(html, url);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final Document getDocument()
		{
		return document;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final String getHTML()
		{
		return html;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final List<String> getLinks()
		{
		return IExtractor.LINKS.apply(document);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final String getURL()
		{
		return url;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final List<String> getWords()
		{
		return IExtractor.WORDS.apply(document);
		}
	}
