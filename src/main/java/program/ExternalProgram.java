package program;

import annotations.WorkInProgress;

@WorkInProgress
public class ExternalProgram implements IExternalProgram
	{
	/*
	@OneShot
	//@Override
	public final void run() throws IOException
		{
		final ProcessBuilder builder = new ProcessBuilder();

		//builder.command(option.getCommand());

		try (final var stdout = new ByteArrayOutputStream(); final var stderr = new ByteArrayOutputStream())
			{
			final Process process = builder.start();

			process.getInputStream().transferTo(stdout);
			process.getErrorStream().transferTo(stderr);

			@SuppressWarnings("unused")
			final int exitCode = process.waitFor();

			//final ExternalProgram program = new ExternalProgram();
			//program.exitCode = exitCode;
			//program.output = stdout.toString();
			//program.error = stderr.toString();
			}
		catch (final InterruptedException ex)
			{
			throw new IOException(ex);
			}

		throw new NotImplementedException();
		}
	*/

	/*
	protected final TemporaryDirectory temporaryDirectory;
	protected final List<Pair<String, String>> options = new ArrayList<>();

	protected final String program;

	public ExternalProgram2()
		{
		this(new TemporaryDirectory());
		}

	public ExternalProgram2(final TemporaryDirectory temporaryDirectory)
		{
		super();

		this.temporaryDirectory = temporaryDirectory;

		throw new NotImplementedException();
		}
	*/

	/*
	protected final void setOption(final String name, final Path value)
		{
		setOption(name, notNull(value).toString());
		}
	*/
	}
