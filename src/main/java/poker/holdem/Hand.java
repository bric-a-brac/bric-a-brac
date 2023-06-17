package poker.holdem;

import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import game.card.Card;
import poker.IHand;

/**
 * <h4>Une main de poker Texas Hold'Em (2 cartes)</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Hand implements IHand<Card>
	{
	// TODO: 2 cartes

	/**
	 * @since 0.1.0
	 */
	@Override
	public List<Card> getCards()
		{
		throw new NotImplementedException();
		}
	}
