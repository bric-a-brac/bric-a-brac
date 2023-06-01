package game.card;

import java.util.List;

/**
 * IDeck
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IDeck<T extends ICard>
	{
	/**
	 * @since 0.1.0
	 */
	public List<T> getCards();

	/**
	 * @since 0.1.0
	 */
	public T deal();

	/**
	 * @since 0.1.0
	 */
	public List<T> deal(int count);

	/**
	 * @since 0.1.0
	 */
	public void shuffle();
	}
