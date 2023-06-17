package poker.holdem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import game.card.Card;
import game.card.IShuffler;

// TODO: Ailleurs..... Deck.Builder ??

public class DeckBuilder implements IShuffler<Card>
	{
	private static final List<Card> CARDS = Card.get();

	public static final Function<int[], Deck> BUILDER = DeckBuilder::build;
	/*
	public static final Function<int[], Deck> BUILDER = indexes ->
		{
		final var cards = new ArrayList<Card>();

		for (var i = 0; i < indexes.length; i++)
			{
			cards.add(CARDS.get(i));
			}

		return new Deck(cards);
		};
	*/

	@Override
	@WorkInProgress
	public final void shuffle(final List<Card> cards)
		{
		throw new NotImplementedException();
		}

	@WorkInProgress
	public static final Deck build(final int[] indexes)
		{
		final var cards = new ArrayList<Card>();

		for (var i = 0; i < indexes.length; i++)
			{
			cards.add(CARDS.get(i));
			}

		return new Deck(cards);
		}
	}
