package game.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatterTest extends Assertions
	{
	@Test
	public void testDefault()
		{
		assertEquals("2S", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.SPADE)));
		assertEquals("AS", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.SPADE)));

		assertEquals("2H", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.HEART)));
		assertEquals("AH", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.HEART)));

		assertEquals("2D", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.DIAMOND)));
		assertEquals("AD", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.DIAMOND)));

		assertEquals("2C", IFormatter.DEFAULT.toString(new Card(Rank.TWO, Suit.CLUB)));
		assertEquals("AC", IFormatter.DEFAULT.toString(new Card(Rank.ACE, Suit.CLUB)));
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
