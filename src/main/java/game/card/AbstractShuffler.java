package game.card;

import java.util.Collections;
import java.util.List;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;

import static util.Argument.notNull;

/**
 * <h4>Mélangeur de cartes</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class AbstractShuffler<T extends ICard> implements IShuffler<T>
	{
	public static final class MT extends AbstractShuffler<ICard>
		{
		private final RandomGenerator RANDOM = new MersenneTwister();

		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public void shuffle(final List<ICard> cards)
			{
			notNull(cards);

			for (var i = cards.size() - 1; i > 0; i--)
				{
				Collections.swap(cards, i, RANDOM.nextInt(i + 1));
				}
			}
		}
	}
