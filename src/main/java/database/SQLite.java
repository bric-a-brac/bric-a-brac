package database;

import java.nio.file.Path;
import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class SQLite extends Database<SQLiteConnection>
	{
	private static final String CONNECTION_STRING = "jdbc:sqlite:%s";

	private static final String MEMORY = ":memory:";

	/**
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	public SQLite() throws SQLException
		{
		super(String.format(CONNECTION_STRING, MEMORY));
		}

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	public SQLite(final Path path) throws SQLException
		{
		super(String.format(CONNECTION_STRING, notNull(path)));
		}
	}
