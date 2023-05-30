package game.card;

import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Formatter implements IFormatter
	{
	private static final int[] SYMBOLS_SUIT_OFFSET = new int[] {0x1F0D1, 0x1F0C1, 0x1F0B1, 0x1F0A1};
	private static final int[] SYMBOLS_RANK_OFFSET = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

	/**
	 * @since 0.1.0
	 */
	public static final IFormatter SYMBOLS = new IFormatter()
		{
		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public String toString(final ICard card)
			{
			notNull(card);

			var codePoint = SYMBOLS_SUIT_OFFSET[card.getSuit().ordinal()];

			codePoint += SYMBOLS_RANK_OFFSET[card.getRank().ordinal()];

			return new String(Character.toChars(codePoint));
			}
		};
	}
