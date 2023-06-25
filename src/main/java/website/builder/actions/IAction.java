package website.builder.actions;

import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;

/**
 * <h4>IAction</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IAction<T, R, E extends Throwable> extends FailableFunction<T, R, E>
	{
	public default R execute(final T input) throws E
		{
		return apply(input);
		}
	}
