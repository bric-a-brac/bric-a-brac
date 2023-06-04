package poker.statistics;

import java.util.function.Consumer;
import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IWalker
	{
	/**
	 * @since 0.1.0
	 */
	public void walk(final Consumer<int[]> consumer);

	//public void walk(int count, Consumer<Card[]> consumer);
	/*
	public void walk(int[] combination);

	public default ICombinationsWalker walker(final int count)
		{

		while (combiner.next(result))
			{
			consumer.accept(result);
			}
		return null;
		}
	*/
	}
