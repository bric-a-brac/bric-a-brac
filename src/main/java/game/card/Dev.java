package game.card;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import poker.evaluator.Evaluator;

public class Dev
	{
	public static String toString(final List<Card> cards)
		{
		return cards.stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()).toString();
		}

	public static void deal() throws IOException
		{
		final var deck = Deck.get();

		deck.shuffle();

		final var players = new ArrayList<List<Card>>();

		for (var i = 0; i < 4; i++)
			{
			final var cards = new ArrayList<Card>();

			cards.add(deck.deal());
			cards.add(deck.deal());

			players.add(cards);
			}

		final var flop = deck.deal(3);

		System.out.println(toString(flop));
		System.out.println();

		final var evaluator = new Evaluator();

		players.forEach(cards ->
			{
			System.out.println(toString(cards));

			cards.addAll(flop);

			final var hand = evaluator.evaluate(cards);

			System.out.println(hand.getType());
			System.out.println();
			});
		}

	public static void shuffle()
		{
		//final var deck = Deck.get();

		for (var i = 0; i < 50; i++)
			{
			final var deck = Deck.get();

			deck.shuffle();

			final var cards = deck.getCards().stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList());

			System.out.println(String.join("", cards));
			}
		}

	public static void main(String[] args) throws Throwable
		{
		deal();
		shuffle();
		}
	}
