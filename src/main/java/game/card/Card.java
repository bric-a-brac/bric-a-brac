package game.card;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;
import parser.IStringParser;
import parser.exceptions.ParseException;

import static util.Argument.notNull;

/**
 * <h4>Carte à jouer</h4>
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

	/**
	 * @since 0.1.0
	 */
	public static final List<Card> get()
		{
		final var cards = new ArrayList<Card>();

		for (final Rank rank : Rank.values())
			{
			for (final Suit suit : Suit.values())
				{
				cards.add(new Card(rank, suit));
				}
			}

		return cards;
		}

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	@WorkInProgress
	public static final class Parser implements IStringParser<List<Card>, ParseException>
		{
		@SuppressWarnings("unused")
		private static final List<Card> CARDS = Card.get();

		/**
		 * @throws NullArgumentException
		 * @throws ParseException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public List<Card> apply(final String input) //throws ParseException
			{
			notNull(input);

			throw new ParseException("Invalid card");
			}

		public static Card parseCard()
			{
			throw new NotImplementedException();
			}
		}
	}
