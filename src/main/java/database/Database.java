package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Database implements IDatabase
	{
	protected final Connection connection;

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	public Database(final String connectionString) throws SQLException
		{
		this(DriverManager.getConnection(notNull(connectionString)));
		}

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	protected Database(final Connection connection)
		{
		super();

		this.connection = notNull(connection);
		}

	/**
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final void close() throws SQLException
		{
		connection.close();
		}
	}
