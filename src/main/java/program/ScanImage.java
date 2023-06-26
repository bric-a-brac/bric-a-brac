package program;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.lang3.NotImplementedException;

import io.TemporaryDirectory;

public final class ScanImage extends ExternalProgram implements IScanner
	{
	@Override
	public void scan() throws IOException
		{
		try
			{
			run(null, (exitCode, stdout, stderr) -> "");
			}
		catch (final InterruptedException ex)
			{
			throw new IOException(ex);
			}
		}

	public BufferedImage scadfdfn() throws IOException, InterruptedException
		{
		run(null, (exitCode, stdout, stderr) -> "");

		run(null, IExternalProgram.asString);

		throw new NotImplementedException();
		}

	public static Path scan(final Mode mode, final Format format) throws IOException, InterruptedException
		{
		final var path = TemporaryDirectory.createTemporaryFile();

		return new ScanImage().run(null, (exitCode, stdout, stderr) ->
			{
			return path;
			});
		}
	}
