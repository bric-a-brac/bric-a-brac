package poker.evaluator;

import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
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

	/**
	 * @since 0.1.0
	 */
	public final boolean isValid()
		{
		return this != INVALID;
		}

	/**
	 * @since 0.1.0
	 */
	@WorkInProgress
	public static final Type get(final int type)
		{
		// TODO: Check bound
		return values()[type];
		}
	}
