package program;

import java.io.ByteArrayOutputStream;
import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;

// TODO: Dans IO ????

@WorkInProgress
@FunctionalInterface
public interface IOutput<T, E extends Throwable> extends FailableFunction<ByteArrayOutputStream, T, E>
	{
	public static final IOutput<String, ? extends Throwable> asString = output -> output.toString();

	public static final IOutput<byte[], ? extends Throwable> asBytes = output -> output.toByteArray();
	}
