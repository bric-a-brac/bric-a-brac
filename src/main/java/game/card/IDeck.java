package game.card;

import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.NotImplementedException;

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
	public Optional<Integer> find(Rank rank, Suit suit);

	/**
	 * @since 0.1.0
	 */
	public T take(int index);

	/**
	 * @since 0.1.0
	 */
	public T take(Rank rank, Suit suit);

	/**
	 * @since 0.1.0
	 */
	public void shuffle();

	/**
	 * @since 0.1.0
	 */
	public default void shuffle(Shuffler<T> shuffler)
		{
		throw new NotImplementedException();
		}
	}
