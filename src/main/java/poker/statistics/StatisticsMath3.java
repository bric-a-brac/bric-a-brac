package poker.statistics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.math3.util.Combinations;
import annotations.WorkInProgress;
import game.card.Card;
import poker.evaluator.Evaluator;
import poker.evaluator.Type;

@WorkInProgress
final class StatisticsMath3
	{
	private static final int N = 7;

	public static Map<Type, AtomicInteger> getStatistics() throws IOException
		{
		final var evaluator = new Evaluator();

		final var hands = new HashMap<Type, AtomicInteger>();

		for (final var type : Type.values())
			{
			hands.put(type, new AtomicInteger(0));
			}

		final var cards = Card.get();

		final var combinations = new Combinations(cards.size(), N);

		combinations.forEach(combination ->
			{
			final var hand = new ArrayList<Card>();

			for (final var index : combination)
				{
				hand.add(cards.get(index));
				}

			final var rank = evaluator.evaluate(hand);

			hands.get(rank.getType()).incrementAndGet();
			});

		return hands;
		}
	}