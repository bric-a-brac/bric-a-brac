package poker.evaluator;

import poker.evaluator.exceptions.InvalidHandException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

// TODO: Chié j'avais trouvé un nom mieux..... :(

// TODO: record

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class HandRank
	{
	private final int rank;
	private final Type type;
	private final int value;

	/**
	 * @throws NullArgumentException
	 * @throws InvalidHandException
	 * 
	 * @since 0.1.0
	 */
	public HandRank(final int rank, final Type type, final int value)
		{
		super();

		notNull(type);

		if (!type.isValid())
			{
			throw new InvalidHandException();
			}

		this.rank = rank;
		this.type = type;
		this.value = value;
		}

	/**
	 * @throws InvalidHandException
	 * 
	 * @since 0.1.0
	 */
	public HandRank(final int rank, final int type, final int value)
		{
		this(rank, Type.get(type), value);
		}

	/**
	 * @since 0.1.0
	 */
	public int getRank()
		{
		return rank;
		}

	/**
	 * @since 0.1.0
	 */
	public Type getType()
		{
		return type;
		}

	/**
	 * @since 0.1.0
	 */
	public int getValue()
		{
		return value;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public String toString()
		{
		return String.format("%s[rank=%d, type=%s, value=%d]", getClass().getSimpleName(), getRank(), getType(), getValue());
		}
	}
