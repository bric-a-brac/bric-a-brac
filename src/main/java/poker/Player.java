package poker;

import org.apache.commons.lang3.NotImplementedException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Player<T extends IHand<?>> implements IPlayer<T>
	{
	private final String name;
	private final T hand;

	public Player(final String name, final T hand)
		{
		super();

		this.name = notNull(name);
		this.hand = notNull(hand);
		}

	@Override
	public String getName()
		{
		return name;
		}

	@Override
	public T getHand()
		{
		return hand;
		}

	@Deprecated
	@Override
	public void setHand(final T hand)
		{
		throw new NotImplementedException();
		}
	}
