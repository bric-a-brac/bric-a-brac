package poker.evaluator;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import game.card.Card;
import game.card.Rank;
import game.card.Suit;
import poker.Poker;

public class EvaluatorTest extends Assertions
	{
	private static final IEvaluator evaluator;

	static
		{
		try
			{
			evaluator = Poker.getPokerEvaluator();
			}
		catch (final IOException ex)
			{
			throw new UncheckedIOException(ex);
			}
		}

	/*
	@BeforeAll
	public static void init() throws IOException
		{
		}
	*/

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
	public void fullHouseUnordered()
		{
		final var cards = new ArrayList<Card>();

		cards.add(new Card(Rank.ACE, Suit.DIAMOND));
		cards.add(new Card(Rank.FIVE, Suit.DIAMOND));
		cards.add(new Card(Rank.ACE, Suit.SPADE));
		cards.add(new Card(Rank.FIVE, Suit.SPADE));
		cards.add(new Card(Rank.ACE, Suit.CLUB));

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
