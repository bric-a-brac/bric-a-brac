package searchengine;

import java.nio.file.Paths;
import java.sql.SQLException;
import annotations.WorkInProgress;
import database.SQLite;

@WorkInProgress
public final class SearchEngine implements ISearchEngine
	{
	private SearchEngine()
		{
		super();

		try (final var database = new SQLite(Paths.get("sdsd")))
			{
			}
		catch (final SQLException ex)
			{
			ex.printStackTrace();
			}
		}

	@Override
	public void run()
		{
		}

	public static void main(final String[] args)
		{
		new SearchEngine().run();

		System.out.println("OK");
		}
	}
