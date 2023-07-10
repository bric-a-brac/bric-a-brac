package web.walle;

import java.nio.file.Paths;
import annotations.WorkInProgress;
import util.Util;
import web.walle.database.Database;

// WebAllEngine ;-)

/**
 * <h4>WallE</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class WallE
	{
	@WorkInProgress
	public static void main(String[] args)
		{
		try
			{
			final var path = Paths.get(Util.getPreference(WallE.class, "database.path"));

			try (final var database = new Database(path))
				{
				final var bot = new Bot(database);

				bot.processNextJob();
				}
			}
		catch (final Throwable ex)
			{
			ex.printStackTrace();
			}
		}
	}
