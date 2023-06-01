package game.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatterTest extends Assertions
	{
	@Test
	public void testDefault()
		{
		assertEquals("2s", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.SPADE)));
		assertEquals("As", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.SPADE)));

		assertEquals("2h", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.HEART)));
		assertEquals("Ah", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.HEART)));

		assertEquals("2d", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.DIAMOND)));
		assertEquals("Ad", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.DIAMOND)));

		assertEquals("2c", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.CLUB)));
		assertEquals("Ac", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.CLUB)));
		}

	@Test
	public void testSymbol()
		{
		// 🂢🂣🂤🂥🂦🂧🂨🂩🂪🂫🂭🂮🂡
		// 🂲🂳🂴🂵🂶🂷🂸🂹🂺🂻🂽🂾🂱
		// 🃂🃃🃄🃅🃆🃇🃈🃉🃊🃋🃍🃎🃁
		// 🃒🃓🃔🃕🃖🃗🃘🃙🃚🃛🃝🃞🃑

		assertEquals("🂢", IFormatter.SYMBOLS.toString(new Card(Rank.TWO, Suit.SPADE)));
		assertEquals("🂡", IFormatter.SYMBOLS.toString(new Card(Rank.ACE, Suit.SPADE)));

		assertEquals("🂲", IFormatter.SYMBOLS.toString(new Card(Rank.TWO, Suit.HEART)));
		assertEquals("🂱", IFormatter.SYMBOLS.toString(new Card(Rank.ACE, Suit.HEART)));

		assertEquals("🃂", IFormatter.SYMBOLS.toString(new Card(Rank.TWO, Suit.DIAMOND)));
		assertEquals("🃁", IFormatter.SYMBOLS.toString(new Card(Rank.ACE, Suit.DIAMOND)));

		assertEquals("🃒", IFormatter.SYMBOLS.toString(new Card(Rank.TWO, Suit.CLUB)));
		assertEquals("🃑", IFormatter.SYMBOLS.toString(new Card(Rank.ACE, Suit.CLUB)));
		}
	}
