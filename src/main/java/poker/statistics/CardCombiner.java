package poker.statistics;

import java.util.function.Consumer;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;
import game.card.Card;
import util.Combiner;

import static util.Argument.notNull;

/**
 * <h4>Générateur de combinaisons de cartes de hlbnet</h4>
 * 
 * Semble plus rapide que la version d'Apache Math3... merci à lui ;-)
 * 
 * @see {@link https://www.developpez.net/forums/u138690/hlbnet/}
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
final class CardCombiner extends Combiner<Card>
	{
	/**
	 * @since 0.1.0
	 */
	public CardCombiner(final int count)
		{
		super(count, Statistics.getCards());
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public void walk(final Consumer<Card[]> consumer)
		{
		notNull(consumer);

		var result = new Card[count];

		while (next(result))
			{
			consumer.accept(result);
			}
		}
	}
