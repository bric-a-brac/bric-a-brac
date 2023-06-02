package poker.training;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

	public static void all()
		{
		final var tokens = new String[] {"Hello", "wonderful", "giant", "world", "leader", "!!!"};

		var count = 3;

		final var combiner = new Combiner<String>(count, tokens);

		var result = new String[count];

		while (combiner.test(result))
			{
			System.out.println(Arrays.toString(result));
			}
		}

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

	public static void main(String[] args) throws Throwable
		{
		// Flop 5, Turn 6, River 7
		//board(7, 10000000);

		//all();
		hands();
		}
	}
