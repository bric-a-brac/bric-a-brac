package poker;

import org.apache.commons.lang3.NotImplementedException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Player<T extends IHand<?>> implements IPlayer<T>
	{
	@Override
	public T getHand()
		{
		throw new NotImplementedException();
		}
	}
