package game.card;

import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import game.card.exceptions.NoMoreCardException;

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
		final var deck = Deck.get();

		assertNotNull(deck);

		assertNotNull(deck.getCards());
		}

	@Test
	public void testDeal()
		{
		final var deck = Deck.get();

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

	@Test
	public void testFind()
		{
		final var deck = Deck.get();

		deck.shuffle();

		var card = deck.deal();

		// Rechercher la carte que l'on vient de dealer
		var found = deck.find(card.getRank(), card.getSuit());

		assertFalse(found.isPresent());

		// Regarder la 10ème carte
		card = deck.getCards().get(10);

		// Rechercher la 10ème carte
		found = deck.find(card.getRank(), card.getSuit());

		assertTrue(found.isPresent());
		assertEquals(9, found.get());
		}
	}
