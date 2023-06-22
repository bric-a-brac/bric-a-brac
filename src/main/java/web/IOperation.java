package web;

import java.io.IOException;
import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;

/**
 * <h4>IOperation</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IOperation<T, R> extends FailableFunction<T, R, IOException>
	{
	}
