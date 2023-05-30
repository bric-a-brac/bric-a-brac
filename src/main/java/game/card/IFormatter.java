package game.card;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IFormatter
	{
	/**
	 * @since 0.1.0
	 */
	public String toString(ICard card);

	/**
	 * @since 0.1.0
	 */
	public String toString(Rank rank);

	/**
	 * @since 0.1.0
	 */
	public String toString(Suit suit);
	}
