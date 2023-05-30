package game.card;

import org.apache.commons.lang3.NotImplementedException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * Carte à jouer
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Card implements ICard
	{
	private static final String FORMAT = "%s[rank=%s, suit=%s]";

	protected static final int SUIT_LENGTH = Suit.values().length;

	protected final Rank rank;
	protected final Suit suit;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Card(final Rank rank, final Suit suit)
		{
		super();

		this.rank = notNull(rank);
		this.suit = notNull(suit);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final Rank getRank()
		{
		return rank;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final Suit getSuit()
		{
		return suit;	
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getValue()
		{
		return rank.ordinal() * SUIT_LENGTH + suit.ordinal();
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public int compareTo(final ICard card)
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public String toString()
		{
		return String.format(FORMAT, getClass().getSimpleName(), getRank().toString(), getSuit().toString());
		}
	}
