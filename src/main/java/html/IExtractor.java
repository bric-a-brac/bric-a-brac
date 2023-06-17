package html;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;
import parser.IParser;
import parser.Tokenizer;
import util.Constant;

import static util.Argument.notNull;

/**
 * <h4>IExtractor</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IExtractor<T extends Element, R> extends IParser<T, R, RuntimeException>
	{
	/**
	 * @since 0.1.0
	 */
	public static final IDocumentExtractor<List<String>> LINKS = document ->
		{
		notNull(document);

		final var links = new ArrayList<String>();

		document.select(Constant.HTML_LINK_QUERY).forEach(link ->
			{
			links.add(link.absUrl(Constant.HREF));
			});

		return links;
		};

	/**
	 * @since 0.1.0
	 */
	public static final IDocumentExtractor<List<String>> WORDS = document ->
		{
		notNull(document);

		return Tokenizer.DEFAULT.tokenize(document.text());
		};
	}
