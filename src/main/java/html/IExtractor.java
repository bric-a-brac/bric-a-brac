package html;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;
import parser.IParser;
import parser.Tokenizer;
import util.Constant;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IExtractor<T, R> extends IParser<T, R, RuntimeException>
	{
	/**
	 * @since 0.1.0
	 */
	public static final IExtractor<Element, List<String>> LINKS = element ->
		{
		notNull(element);

		final var links = new ArrayList<String>();

		element.select(Constant.HTML_LINK_QUERY).forEach(link ->
			{
			links.add(link.absUrl(Constant.HREF));
			});

		return links;
		};

	/**
	 * @since 0.1.0
	 */
	public static final IExtractor<Element, List<String>> WORDS = element ->
		{
		notNull(element);

		return Tokenizer.DEFAULT.tokenize(element.text());
		};
	}
