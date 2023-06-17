package poker.holdem;

import game.card.Card;
import poker.IPlayer;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Player implements IPlayer<Card, Hand>
	{
	private final String name;
	private final Hand hand;

	public Player(final String name)
		{
		super();

		this.name = notNull(name);

		hand = new Hand();
		}

	@Override
	public String getName()
		{
		return name;
		}

	@Override
	public Hand getHand()
		{
		return hand;
		}
	}
