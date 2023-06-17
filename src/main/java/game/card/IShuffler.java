package game.card;

import java.util.List;

/**
 * <h4>IShuffler</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IShuffler<T extends ICard>
	{
	/**
	 * @since 0.1.0
	 */
	public void shuffle(List<T> cards);
	}
