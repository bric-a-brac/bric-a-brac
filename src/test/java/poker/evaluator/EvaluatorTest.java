package poker.evaluator;

import java.io.IOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import game.card.Card;
import game.card.Rank;
import game.card.Suit;

public class EvaluatorTest extends Assertions
	{
	private static IEvaluator evaluator;

	@BeforeAll
	public static void init() throws IOException
		{
		evaluator = new Evaluator();
		}

	@Test
	public void testFullHouse()
		{
		final var cards = new ArrayList<Card>();

		cards.add(new Card(Rank.ACE, Suit.SPADE));
		cards.add(new Card(Rank.ACE, Suit.CLUB));
		cards.add(new Card(Rank.ACE, Suit.DIAMOND));
		cards.add(new Card(Rank.FIVE, Suit.DIAMOND));
		cards.add(new Card(Rank.FIVE, Suit.SPADE));

		assertEquals(Type.FULL_HOUSE, evaluator.evaluate(cards).getType());
		}

	@Test
	public void testStraightFlush()
		{
		final var cards = new ArrayList<Card>();

		cards.add(new Card(Rank.ACE, Suit.SPADE));
		cards.add(new Card(Rank.KING, Suit.SPADE));
		cards.add(new Card(Rank.QUEEN, Suit.SPADE));
		cards.add(new Card(Rank.JACK, Suit.SPADE));
		cards.add(new Card(Rank.TEN, Suit.SPADE));
		cards.add(new Card(Rank.THREE, Suit.CLUB));
		cards.add(new Card(Rank.FIVE, Suit.HEART));

		assertEquals(Type.STRAIGHT_FLUSH, evaluator.evaluate(cards).getType());
		}
	}
