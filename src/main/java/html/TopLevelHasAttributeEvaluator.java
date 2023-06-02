package html;

import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.nodes.Element;

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
