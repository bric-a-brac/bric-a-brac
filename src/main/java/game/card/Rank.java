package game.card;

import java.util.function.Predicate;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public enum Rank
	{
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	TEN,
	JACK,
	QUEEN,
	KING,
	ACE;

	/**
	 * @since 0.1.0
	 */
	public static final <T extends ICard> Predicate<T> same(final Rank rank)
		{
		return card -> notNull(card).getRank().equals(notNull(rank));
		}
	}
