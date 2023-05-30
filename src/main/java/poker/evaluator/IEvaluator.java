package poker.evaluator;

import java.util.List;
import java.util.function.Function;
import game.card.Card;
import util.exceptions.NullArgumentException;

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

	// TODO: Parse string
	/*
	public default String evaluate(final String cards)
		{
		throw new NotImplementedException();
		}
	*/
	}
