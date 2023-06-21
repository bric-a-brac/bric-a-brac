package http;

import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;

@WorkInProgress
@FunctionalInterface
public interface IContentHandler<T, R, E extends Throwable> extends FailableFunction<T, R, E>
	{
	}
