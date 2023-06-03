package poker.statistics;

import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public interface ICombinationsProvider<T> extends IProvider<T>
	{
	/**
	 * @since 0.1.0
	 */
	public long getCombinations();
	}
