package database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.commons.lang3.function.FailableFunction;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IDatabase extends AutoCloseable
	{
	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<PreparedStatement, PreparedStatement, SQLException> UPDATE = statement ->
		{
		statement.executeUpdate();

		return statement;
		};

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<PreparedStatement, Integer, SQLException> COUNT = statement -> Integer.valueOf(statement.getUpdateCount());

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<PreparedStatement, Integer, SQLException> LAST_INSERT_ID = statement ->
		{
		try (final var keys = statement.getGeneratedKeys())
			{
			if (keys.next())
				{
				final var id = keys.getInt(1);

				if (!keys.wasNull())
					{
					return Integer.valueOf(id);
					}
				}
			}

		return null;
		};

	/**
	 * @since 0.1.0
	 */
	@Override
	public void close() throws SQLException;
	}
