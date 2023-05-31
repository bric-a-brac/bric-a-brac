package database;

import java.sql.SQLException;

public class Dev
	{
	public static void sqlite() throws SQLException
		{
		try (final var database = new SQLite())
			{
			database.getConnection().createStatement().execute("CREATE TABLE t (INT f)");

			final var s = database.getConnection().prepareStatement("INSERT INTO t VALUES (?)");

			s.setInt(1, 4);
			s.execute();

			var id = IDatabase.LAST_INSERT_ID.apply(s);
			System.out.println(id);
			}
		}

	public static void main(String[] args) throws Throwable
		{
		sqlite();
		//System.out.println(Integer.valueOf(null));
		}
	}
