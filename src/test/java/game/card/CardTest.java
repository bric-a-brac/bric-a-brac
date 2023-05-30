package game.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest extends Assertions
	{
	@Test
	public void testGetters()
		{
		final var card = new Card(Rank.QUEEN, Suit.HEART);

		assertEquals(Rank.QUEEN, card.getRank());
		assertEquals(Suit.HEART, card.getSuit());
		assertEquals(42, card.getValue());

		assertEquals(0, new Card(Rank.TWO, Suit.CLUB).getValue());
		assertEquals(51, new Card(Rank.ACE, Suit.SPADE).getValue());
		}
	}
