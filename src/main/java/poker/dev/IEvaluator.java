package poker.dev;

import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;
import game.card.Card;

import static util.Argument.notNull;

/**
 * <h4>IEvaluator</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IEvaluator extends Function<int[], ICombination>
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public default ICombination evaluate(final int[] cards)
		{
		return apply(notNull(cards));
		}

	@WorkInProgress
	public default ICombination evaluate(final Card[] cards)
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public default ICombination evaluate(final List<Card> cards)
		{
		final var values = notNull(cards).stream().mapToInt(card -> card.getValue() + 1).toArray();

		return evaluate(values);
		}
	}
