package game.card;

import java.util.List;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import game.card.exceptions.NoMoreCardException;
import util.exceptions.NullArgumentException;

public class DeckTest extends Assertions
	{
	@Test
	public void testConstructorNull()
		{
		assertThrowsExactly(NullArgumentException.class, () ->
			{
			new Deck<ICard>((Supplier<List<ICard>>) null);
			});

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			new Deck<ICard>(() -> null);
			});

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			new Deck<ICard>((List<ICard>) null);
			});
		}

	@Test
	public void testGetDeck()
		{
		final var deck = IDeck.get();

		assertNotNull(deck);

		assertNotNull(deck.getCards());
		}

	@Test
	public void testDeal()
		{
		final var deck = IDeck.get();

		assertEquals(52, deck.getCards().size());

		final var card = deck.deal();

		assertNotNull(card);

		assertEquals(51, deck.getCards().size());

		deck.deal();

		assertEquals(50, deck.getCards().size());

		final var cards = deck.deal(16);

		assertNotNull(cards);

		assertEquals(16, cards.size());

		assertEquals(34, deck.getCards().size());

		deck.deal(34);

		assertThrowsExactly(NoMoreCardException.class, () ->
			{
			deck.deal();
			});

		assertThrowsExactly(NoMoreCardException.class, () ->
			{
			deck.deal(4);
			});
		}
	}
