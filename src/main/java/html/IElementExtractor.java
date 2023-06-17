package html;

import org.jsoup.nodes.Element;

/**
 * <h4>IElementExtractor</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IElementExtractor<T> extends IExtractor<Element, T>
	{
	}
