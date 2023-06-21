package database;

import java.nio.file.Path;
import java.sql.SQLException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.sqlite.SQLiteConnection;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class SQLite extends Database<SQLiteConnection>
	{
	protected static final String CONNECTION_STRING = "jdbc:sqlite:%s";

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	protected SQLite(final String connectionString) throws SQLException
		{
		super(connectionString);
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
