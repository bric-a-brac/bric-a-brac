package poker.dev;

/**
 * <h4>Une combinaison de cartes de poker</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Combination implements ICombination
	{
	private final int rank;
	private final Type type;
	private final int value;

	public Combination(final int value)
		{
		super();

		final var type = value >> 12;

		if (type == 0)
			{
			}

		final var rank = value & 0x00000FFF;

		this.rank = rank;
		this.type = null;
		this.value = value;
		}

	@Override
	public int getRank()
		{
		return rank;
		}

	@Override
	public Type getType()
		{
		return type;
		}

	@Override
	public int getValue()
		{
		return value;
		}
	}
