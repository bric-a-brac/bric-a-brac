package program;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import annotations.WorkInProgress;

@WorkInProgress
public class ExternalProgram implements IExternalProgram
	{
	@Deprecated
	protected final String badStdoutOrStdErr(int exitCode, ByteArrayOutputStream stdout, ByteArrayOutputStream stderr)
		{
		return exitCode == 0 ? stdout.toString() : stderr.toString();
		}

	@Deprecated
	protected final String asStringOrThrow(int exitCode, ByteArrayOutputStream stdout, ByteArrayOutputStream stderr) throws IOException
		{
		if (exitCode == 0)
			{
			return stdout.toString();
			}

		throw new IOException();
		}

	protected final <T> T run(final List<String> command, final IFindGoodName<T> findGoodName) throws IOException, InterruptedException
		{
		try (final var stdout = new ByteArrayOutputStream(); final var stderr = new ByteArrayOutputStream())
			{
			final var builder = new ProcessBuilder();

			builder.command(command);

			final var process = builder.start();

			process.getInputStream().transferTo(stdout);
			process.getErrorStream().transferTo(stderr);

			final int exitCode = process.waitFor();

			return findGoodName.result(exitCode, stdout, stderr);
			}
		}
	}
