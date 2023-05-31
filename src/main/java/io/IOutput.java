package io;

import java.io.IOException;
import org.apache.commons.lang3.function.FailableConsumer;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IOutput<T> extends FailableConsumer<T, IOException>
	{
	}
