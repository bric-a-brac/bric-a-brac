package poker.statistics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import annotations.WorkInProgress;
import game.card.Card;
import game.card.Deck;
import poker.evaluator.Evaluator;
import poker.evaluator.Type;
import poker.training.Combiner;

/**
 * <h4>Statistiques Poker<h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Statistics
	{
	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public static final class Builder
		{
		}

	/*
	public static void name()
		{
		StatisticsMath3.getStatistics().forEach((type, count) ->
			{
			System.out.println(type.toString() + ": " + count.toString());
			});
		}
	*/

	public static void hands()
		{
		final var cards = Card.get().toArray(new Card[0]);
		//final var cards = Card.get().stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()).toArray(new String[0]);

		final var count = 5;

		final var combiner = new Combiner<Card>(count, cards);

		var result = new Card[count];

		var n = 0;

		while (combiner.test(result))
			{
			//System.out.println(Arrays.toString(result));
			n++;
			}

		System.out.println("Nombre de combinaisons de 5 cartes: " + n);
		//                                     2598960
		// Nombre de combinaisons de 5 cartes: 2598960
		}

	public static void board(final int c, final int n) throws IOException
		{
		final var evaluator = new Evaluator();

		final var hands = new HashMap<Type, AtomicInteger>();

		for (var type : Type.values())
			{
			hands.put(type, new AtomicInteger(0));
			}

		for (var i = 0; i < n; i++)
			{
			final var deck = Deck.get();

			deck.shuffle();

			final var cards = new ArrayList<Card>();

			cards.addAll(deck.deal(c));

			final var hand = evaluator.evaluate(cards).getType();

			hands.get(hand).getAndIncrement();
			}

		hands.forEach((type, count) ->
			{
			System.out.println(type + ": " + count + " (" + (count.get() * 100.0 / n) + "%)");
			});
		}
	}
