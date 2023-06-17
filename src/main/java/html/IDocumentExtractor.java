package html;

import org.jsoup.nodes.Document;

/**
 * <h4>IDocumentExtractor</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IDocumentExtractor<T> extends IExtractor<Document, T>
	{
	}
