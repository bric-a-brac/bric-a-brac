package database;

import java.sql.SQLException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class InMemoryDatabase extends SQLite
	{
	private static final String MEMORY = ":memory:";

	public InMemoryDatabase() throws SQLException
		{
		super(String.format(CONNECTION_STRING, MEMORY));
		}

	/*
	public int insert() throws SQLException
		{
		final FailableFunction<PreparedStatement, PreparedStatement, SQLException> query = statement -> statement;

		execute("sdds", query.andThen(UPDATE).andThen(COUNT));

		return execute("sdds", query.andThen(UPDATE).andThen(LAST_INSERT_ID));
		}

	private final <T> T execute(final String sql, final FailableFunction<PreparedStatement, T, SQLException> function) throws SQLException
		{
		notNull(sql);
		notNull(function);

		try (final var statement = connection.prepareStatement("null", Statement.RETURN_GENERATED_KEYS))
			{
			return function.apply(statement);
			}
		}
	*/
	}
