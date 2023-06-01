package parser;

import org.apache.commons.lang3.function.FailableFunction;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IParser<T, R, E extends Throwable> extends FailableFunction<T, R, E>
	{
	/**
	 * @since 0.1.0
	 */
	public default R parse(final T value) throws E
		{
		return apply(value);
		}
	}
