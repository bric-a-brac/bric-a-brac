package html;

import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.nodes.Element;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class TopLevelAttributeEvaluator extends TopLevelEvaluator
	{
	protected final String attribute;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public TopLevelAttributeEvaluator(final String attribute)
		{
		super();

		this.attribute = notNull(attribute);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public boolean test(final Element element)
		{
		return element.hasAttr(attribute) && element.attr(attribute).equalsIgnoreCase(attribute);
		}
	}
