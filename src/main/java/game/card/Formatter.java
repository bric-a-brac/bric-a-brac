package game.card;

import org.apache.commons.lang3.NotImplementedException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Formatter implements IFormatter
	{
	/**
	 * @since 0.1.0
	 */
	public static final IFormatter CARDS = new Formatter()
		{
		//private static final int START = 0x1F0A1;

		/**
		 * @throws NullArgumentException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public String toString(final ICard card)
			{
			notNull(card);

			//var codePoint = START;
			var codePoint = 0x1F0A1;

			codePoint += card.getSuit().ordinal() * 15;
			codePoint += card.getRank().ordinal() + 1;

			return new String(Character.toChars(codePoint));
			}
		};

	/**
	 * @since 0.1.0
	 */
	@Override
	public String toString(final ICard card)
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public String toString(final Rank rank)
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public String toString(final Suit suit)
		{
		throw new NotImplementedException();
		}
	}
