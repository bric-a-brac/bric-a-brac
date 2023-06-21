package html;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import parser.IStringParser;
import parser.Tokenizer;
import util.Constant;

import static util.Argument.notNull;

/**
 * <h4>HTML Parser</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Parser implements IStringParser<Document, RuntimeException>
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
	public static final Document parse(final String html, final String url)
		{
		notNull(url);
		notNull(html);

		return Jsoup.parse(html, url);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final <T extends Element> List<String> links(final T element)
		{
		notNull(element);

		final var links = new ArrayList<String>();

		element.select(Constant.HTML_LINK_QUERY).forEach(link ->
			{
			links.add(link.absUrl(Constant.HREF));
			});

		return links;
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final <T extends Element> List<String> words(final T element)
		{
		notNull(element);

		return Tokenizer.DEFAULT.tokenize(element.text());
		};

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final List<String> list(final Elements elements)
		{
		notNull(elements);

		return elements.stream().map(element -> element.text()).collect(Collectors.toList());
		}
	}
