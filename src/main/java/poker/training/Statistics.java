package poker.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import game.card.Card;
import game.card.Deck;
import poker.evaluator.Evaluator;
import poker.evaluator.Type;

public class Statistics
	{
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

	public static void main(String[] args) throws Throwable
		{
		// Flop 5, Turn 6, River 7

		board(7, 10000000);
		}
	}
