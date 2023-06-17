package poker;

import game.card.ICard;

/**
 * <h4>IPlayer</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IPlayer<T extends ICard, U extends IHand<T>>
	{
	/**
	 * @since 0.1.0
	 */
	public String getName();

	/**
	 * @since 0.1.0
	 */
	public U getHand();
	}
