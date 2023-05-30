package game.card;

import java.util.List;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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

		assertEquals(52, deck.getCards().size());
		}
	}
