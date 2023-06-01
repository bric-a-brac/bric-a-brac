package game.card;

import java.util.Comparator;
import util.Util;

/**
 * ICard
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface ICard extends Comparable<ICard>
	{
	/**
	 * @since 0.1.0
	 */
	public static final Comparator<ICard> BY_RANK = Util.intGetterComparator(card -> card.getRank().ordinal());

	/**
	 * @since 0.1.0
	 */
	public static final Comparator<ICard> BY_SUIT = Util.intGetterComparator(card -> card.getSuit().ordinal());

	/**
	 * @since 0.1.0
	 */
	public static final Comparator<ICard> BY_VALUE = Util.intGetterComparator(ICard::getValue);

	/**
	 * @since 0.1.0
	 */
	public Rank getRank();

	/**
	 * @since 0.1.0
	 */
	public Suit getSuit();

	/**
	 * @since 0.1.0
	 */
	public int getValue();
	}
