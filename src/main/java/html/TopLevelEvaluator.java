package html;

import java.util.function.Predicate;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

/**
 * <h4>Top Level Evaluator</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class TopLevelEvaluator extends Evaluator implements Predicate<Element>
	{
	/**
	 * @since 0.1.0
	 */
	@Override
	public boolean test(final Element element)
		{
		return false;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final boolean matches(final Element root, final Element element)
		{
		if (test(element))
			{
			for (var parent : element.parents())
				{
				if (test(parent))
					{
					return false;
					}
				}

			return true;
			}

		return false;
		}
	}
