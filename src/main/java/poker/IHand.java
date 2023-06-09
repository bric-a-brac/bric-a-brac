package poker;

import java.util.List;
import game.card.ICard;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IHand<T extends ICard>
	{
	/**
	 * @since 0.1.0
	 */
	public List<T> getCards();
	}
