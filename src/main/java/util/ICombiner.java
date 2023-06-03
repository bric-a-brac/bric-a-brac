package util;

import java.util.function.Predicate;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface ICombiner<T> extends Predicate<T[]>
	{
	/**
	 * @since 0.1.0
	 */
	public default boolean next(T[] result)
		{
		return test(result);
		}
	}
