package poker.evaluator;

import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import game.card.Card;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IEvaluator extends Function<List<Card>, HandRank>
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public default HandRank evaluate(final List<Card> cards)
		{
		return apply(cards);
		}

	/**
	 * @throws NotImplementedException
	 * 
	 * @since 0.1.0
	 */
	public default HandRank evaluate(final int[] cards)
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws NotImplementedException
	 * 
	 * @since 0.1.0
	 */
	public default String evaluate(final String cards)
		{
		// TODO: Parse string
		throw new NotImplementedException();
		}
	}
