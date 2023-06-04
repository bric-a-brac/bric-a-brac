package poker.statistics;

import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import annotations.WorkInProgress;

/**
 * <h4>Statistiques Poker (générteur de combinaisons de hlbnet)<h4>
 * 
 * @see {@link https://www.developpez.net/forums/u138690/hlbnet/}
 */

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
final class Hlbnet implements IProvider
	{
	/**
	 * @throws NotStrictlyPositiveException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public IWalker apply(final int value)
		{
		return consumer ->
			{
			var result = new int[value];

			for (var i = 0; i < value; i++)
				{
				consumer.accept(result);
				}
			};
		}

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
	/*
	private static final class CardCombiner extends Combiner<Card> implements Consumer<Card[]>
		{
		public CardCombiner(final int count)
			{
			super(count, Statistics.getCards());
			}
		}
	*/
	}
