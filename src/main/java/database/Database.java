package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Database<T extends Connection> implements IDatabase<T>
	{
	protected final T connection;

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	@SuppressWarnings("unchecked")
	public Database(final String connectionString) throws SQLException
		{
		this((T) DriverManager.getConnection(notNull(connectionString)));
		}

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	protected Database(final T connection)
		{
		super();

		this.connection = notNull(connection);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final T getConnection()
		{
		return connection;
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
