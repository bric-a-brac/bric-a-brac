package website.builder.actions;

import org.apache.commons.lang3.function.FailableConsumer;
import annotations.WorkInProgress;

/**
 * <h4>IOperation</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IOperation<T, E extends Throwable> extends FailableConsumer<T, E>
	{
	}
