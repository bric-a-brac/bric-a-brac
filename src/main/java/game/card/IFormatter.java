package game.card;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IFormatter
	{
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

	//public String toString(ICard card);
	//public String toString(Rank rank);
	//public String toString(Suit suit);
	}
