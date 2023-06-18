package game.card;

import java.util.function.Predicate;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public enum Suit
	{
	CLUB,
	DIAMOND,
	HEART,
	SPADE;

	/**
	 * @since 0.1.0
	 */
	public static final Predicate<ICard> same(final Suit suit)
		{
		return card -> notNull(card).getSuit().equals(notNull(suit));
		}
	}
