package game.card;

import java.util.Comparator;
import java.util.function.ToIntFunction;

/**
 * ICard
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface ICard
	{
	public static final String CARDS = "🃒🃓🃔🃕🃖🃗🃘🃙🃚🃛🃝🃞🃑🃂🃃🃄🃅🃆🃇🃈🃉🃊🃋🃍🃎🃁🂲🂳🂴🂵🂶🂷🂸🂹🂺🂻🂽🂾🂱🂢🂣🂤🂥🂦🂧🂨🂩🂪🂫🂭🂮🂡";

	public static final String SUITS = "♠♥♦♣";

	public static final String RANKS = "23456789TJQKA";

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
	public static String[] getCards()
		{
		final var size = CARDS.length() / 2;

		final var cards = new String[size];

		for (var i = 0; i < size; i++)
			{
			cards[i] = CARDS.substring(i * 2, i * 2 + 2);
			}

		return cards;
		}

	/**
	 * @since 0.1.0
	 */
	// TODO: Dans util
	public static Comparator<ICard> intComparator(final ToIntFunction<ICard> getter)
		{
		return (left, right) ->
			{
			if (left == null)
				{
				if (right == null)
					{
					return 0;
					}

				return 1;
				}

			if (right == null)
				{
				return -1;
				}

			return Integer.compare(getter.applyAsInt(left), getter.applyAsInt(right));
			};
		}

	//public static final Comparator<ICard> BY_RANK = intComparator(ICard::getRank);

	public static final Comparator<ICard> BY_VALUE = intComparator(ICard::getValue);
	}
