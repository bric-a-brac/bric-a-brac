package poker.evaluator;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
public enum Type
	{
	INVALID,

	HIGH_CARD,
	ONE_PAIR,
	TWO_PAIRS,
	THREE_OF_A_KIND,
	STRAIGHT,
	FLUSH,
	FULL_HOUSE,
	FOUR_OF_A_KIND,
	STRAIGHT_FLUSH;

	public final boolean isValid()
		{
		return this != INVALID;
		}

	public static final Type get(final int type)
		{
		return values()[type];
		}
	}
