package database;

import org.sqlite.SQLiteConnection;
import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class InMemoryDatabase extends SQLite
	{
	private static final String MEMORY = ":memory:";

	@WorkInProgress
	public InMemoryDatabase()
		{
		super((SQLiteConnection) getConnection(String.format(CONNECTION_STRING, MEMORY)));
		}
	}
