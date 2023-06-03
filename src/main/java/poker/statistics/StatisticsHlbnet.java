package poker.statistics;

import annotations.WorkInProgress;

/**
 * <h4>Statistiques Poker (générteur de combinaisons de hlbnet)<h4>
 * 
 * @see {@link https://www.developpez.net/forums/u138690/hlbnet/}
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
final class StatisticsHlbnet
	{
	public static long combinations(final int n)
		{
		return new CardCombiner(n).count();

		/*
		final var combiner = new CardCombiner(n);

		final var count = new AtomicLong(0L);

		combiner.walk(result ->
			{
			count.incrementAndGet();
			});

		return count.get();
		*/
		}

	//final var cards = Card.get().stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()).toArray(new String[0]);
	}
