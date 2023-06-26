package program;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import annotations.WorkInProgress;

@WorkInProgress
public interface IExternalProgram
	{
	public static final IExternalProgram.IFindGoodName<String> asString = (exitCode, stdout, stderr) ->
		{
		if (exitCode == 0)
			{
			return stdout.toString();
			}

		throw new IOException();
		};

	@WorkInProgress
	@FunctionalInterface
	public static interface IFindGoodName<T>
		{
		public T result(int exitCode, ByteArrayOutputStream stdout, ByteArrayOutputStream stderr) throws IOException;
		}
	}
