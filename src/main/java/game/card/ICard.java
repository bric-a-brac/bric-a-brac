package game.card;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import util.Util;

/**
 * ICard
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface ICard extends Comparable<ICard>
	{
	@Deprecated
	public static final String CARDS = "🃒🃓🃔🃕🃖🃗🃘🃙🃚🃛🃝🃞🃑🃂🃃🃄🃅🃆🃇🃈🃉🃊🃋🃍🃎🃁🂲🂳🂴🂵🂶🂷🂸🂹🂺🂻🂽🂾🂱🂢🂣🂤🂥🂦🂧🂨🂩🂪🂫🂭🂮🂡";

	@Deprecated // Dans ENUM
	public static final String SUITS = "♠♥♦♣";

	@Deprecated // Dans ENUM
	public static final String RANKS = "23456789TJQKA";

	public static final Comparator<ICard> BY_RANK = Util.intGetterComparator(card -> card.getRank().ordinal());

	public static final Comparator<ICard> BY_SUIT = Util.intGetterComparator(card -> card.getSuit().ordinal());

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

	/**
	 * @since 0.1.0
	 */
	@SuppressWarnings("unchecked")
	public static <T extends ICard> List<T> get()
		{
		final var cards = new ArrayList<ICard>();

		for (final Rank rank : Rank.values())
			{
			for (final Suit suit : Suit.values())
				{
				cards.add(new Card(rank, suit));
				}
			}

		return (List<T>) cards;
		}

	/**
	 * @since 0.1.0
	 */
	@Deprecated
	public static String[] getSymbols()
		{
		/*
		final var size = CARDS.length() / 2;

		final var symbols = new String[size];

		for (var i = 0; i < size; i++)
			{
			symbols[i] = CARDS.substring(i * 2, i * 2 + 2);
			}

		return symbols;
		*/
		throw new NotImplementedException();
		}
	}
