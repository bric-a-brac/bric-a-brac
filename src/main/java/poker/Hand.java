package poker;

import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import game.card.ICard;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Hand<T extends ICard> implements IHand<T>
	{
	/**
	 * @since 0.1.0
	 */
	@Override
	public final List<T> getCards()
		{
		throw new NotImplementedException();
		}
	}
