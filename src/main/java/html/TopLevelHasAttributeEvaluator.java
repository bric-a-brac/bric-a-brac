package html;

import org.jsoup.nodes.Element;
import util.exceptions.NullArgumentException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class TopLevelHasAttributeEvaluator extends TopLevelAttributeEvaluator
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public TopLevelHasAttributeEvaluator(final String attribute)
		{
		super(attribute);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public boolean test(final Element element)
		{
		return element.hasAttr(attribute);
		}
	}
