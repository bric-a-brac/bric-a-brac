package poker.holdem;

import java.util.List;
import game.card.Card;

public final class Deck extends game.card.Deck<Card>
	{
	public Deck()
		{
		this(Card.get());
		}

	public Deck(final List<Card> cards)
		{
		super(cards);
		}

	public static final class Builder
		{
		}
	}
