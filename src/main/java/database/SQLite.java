package database;

import java.nio.file.Path;
import org.sqlite.SQLiteConnection;
import database.exceptions.DatabaseException;
import util.Argument;
import util.exceptions.NullArgumentException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class SQLite extends AbstractDatabase<SQLiteConnection>
	{
	protected static final String CONNECTION_STRING = "jdbc:sqlite:%s";

	/**
	 * @throws NullArgumentException
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	public SQLite(final Path path)
		{
		this(getConnection(path));
		}

	/**
	 * @throws NullArgumentException
	 * @throws EmptyArgumentException
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	protected SQLite(final SQLiteConnection connection)
		{
		super(connection);
		}

	/**
	 * @throws NullArgumentException
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	private static final SQLiteConnection getConnection(final Path path)
		{
		Argument.notNull(path);

		return (SQLiteConnection) getConnection(String.format(CONNECTION_STRING, path));
		}
	}
