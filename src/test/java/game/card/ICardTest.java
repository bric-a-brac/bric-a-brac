package game.card;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ICardTest extends Assertions
	{
	@Test
	public void testSortByRank()
		{
		final var deck = Deck.get();

		// TODO: Shuffle aussi que pour liste de cartes ;-) pas dans deck
		deck.shuffle();

		final var cards = new ArrayList<ICard>();

		cards.addAll(deck.getCards());

		cards.sort(ICard.BY_RANK);

		final var ranks = cards.stream().map(card -> card.getRank());

		assertTrue(ranks.findFirst().get().equals(Rank.TWO));
		}
	}
