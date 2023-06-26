package io;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;

@WorkInProgress
@FunctionalInterface
public interface IOutput2<T extends OutputStream, R, E extends Throwable> extends FailableFunction<T, R, E>
	{
	public default void asas() throws E
		{
		apply(null);
		}

	@WorkInProgress
	public static interface dff<E extends Throwable> extends IOutput2<ByteArrayOutputStream, String, E>
		{
		@Override
		public default String apply(final ByteArrayOutputStream input) throws E {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException("Unimplemented method 'apply'");
			}
		}

	public static final IOutput2<ByteArrayOutputStream, String, ? extends Throwable> asString = output -> output.toString();

	public static final IOutput2<ByteArrayOutputStream, byte[], ? extends Throwable> asBytes = output -> output.toByteArray();
	}
