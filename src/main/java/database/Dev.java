package database;

import java.sql.SQLException;

public class Dev
	{
	public static void sqlite() throws SQLException
		{
		try (final var database = new InMemoryDatabase())
			{
			/*
			database.getConnection().createStatement().execute("CREATE TABLE t (INT f)");

			final var statement = database.getConnection().prepareStatement("INSERT INTO t VALUES (?)");

			final var action = database.update().andThen(database.lastInsertID());

			statement.setInt(1, 3434);

			final var id = action.apply(statement);

			id.ifPresent(System.out::println);
			*/

			/*
			database.transaction(() ->
				{
				for (var i = 0; i < 1000; i++)
					{
					statement.setInt(1, i);

					final var id = action.apply(statement);

					id.ifPresent(System.out::println);
					}

				return null;
				});
			*/
			}
		}

	public static void main(String[] args) throws Throwable
		{
		sqlite();
		}
	}
