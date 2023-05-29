package poker.evaluator;

import java.io.IOException;
import java.util.ArrayList;
import game.card.Card;
import game.card.Rank;
import game.card.Suit;

public class Dev
	{
	public static void fullHouseUnordered(final IEvaluator evaluator)
		{
		final var cards = new ArrayList<Card>();

		cards.add(new Card(Rank.ACE, Suit.DIAMOND));
		cards.add(new Card(Rank.FIVE, Suit.DIAMOND));
		cards.add(new Card(Rank.ACE, Suit.SPADE));
		cards.add(new Card(Rank.FIVE, Suit.SPADE));
		cards.add(new Card(Rank.ACE, Suit.CLUB));

		final var hand = evaluator.evaluate(cards);

		System.out.println(hand);
		}

		public static void evaluator() throws IOException
		{
		final var path = "/home/thefab/Documents/Code/poker-evaluator-master/data/HandRanks.dat";

		final var evaluator = new Evaluator(path);

		fullHouseUnordered(evaluator);
		}

	public static void main(String[] args) throws Exception
		{
		evaluator();
		}
	}
