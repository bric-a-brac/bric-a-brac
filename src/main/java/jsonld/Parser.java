package jsonld;

import java.util.List;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import html.TopLevelHasAttributeEvaluator;
import parser.IParser;

/**
 * <h4>Parser</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class Parser implements IParser<Document, List<Thing>, RuntimeException>
	{
	@Override
	public List<Thing> apply(final Document document)
		{
		final var evaluator = new TopLevelHasAttributeEvaluator("itemscope");
		document.select(evaluator);
		return null;
		}
	}
