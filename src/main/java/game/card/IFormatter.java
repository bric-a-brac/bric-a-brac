package game.card;

import org.apache.commons.math3.exception.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IFormatter
	{
	/**
	 * @since 0.1.0
	 */
	public static final IFormatter DEFAULT = new IFormatter()
		{
		/**
		 * @since 0.1.0
		 */
		private final String[] ranks = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};

		/**
		 * @since 0.1.0
		 */
		private final String[] suits = new String[] {"C", "D", "H", "S"};
		//private final String[] suits = new String[] {"c", "d", "h", "s"};
		//public static final String[] SUITS = new String[] {"♣", "♦", "♥", "♠"};

		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public String toString(final Rank rank)
			{
			return ranks[notNull(rank).ordinal()];
			}

		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public String toString(final Suit suit)
			{
			return suits[notNull(suit).ordinal()];
			}

		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public String toString(final ICard card)
			{
			notNull(card);

			return toString(card.getRank()) + toString(card.getSuit());
			}
		};

	/**
	 * @since 0.1.0
	 */
	public static final IFormatter SYMBOLS = new IFormatter()
		{
		private final int[] suits = new int[] {0x1F0D1, 0x1F0C1, 0x1F0B1, 0x1F0A1};
		// Y'a une carte entre J et Q !!!!!!!!!!!
		private final int[] ranks = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 0};

		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public String toString(final ICard card)
			{
			notNull(card);

			var codePoint = suits[card.getSuit().ordinal()];

			codePoint += ranks[card.getRank().ordinal()];

			var characters = Character.toChars(codePoint);

			return new String(characters);
			}
		};

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default String toString(final ICard card)
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default String toString(final Rank rank)
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default String toString(final Suit suit)
		{
		throw new UnsupportedOperationException();
		}
	}
