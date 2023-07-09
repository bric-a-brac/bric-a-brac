package web.walle;

import java.net.URI;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import database.InMemoryDatabase;
import database.SQLite;
import database.exceptions.DatabaseException;

/**
 * <h4>Axiom</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Axiom extends SQLite //InMemoryDatabase
	{
	public Axiom()
		{
		super(Paths.get("walle.sqlite"));

		try
			{
			getConnection().createStatement().execute("CREATE TABLE word (TEXT word NOT NULL);");
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		}

	@WorkInProgress
	public void saveWords(final List<String> words)
		{
		try
			{
			final var statement = getConnection().prepareStatement("INSERT INTO word VALUES (?)");

			final var c = transaction(() ->
				{
				var count = 0;

				for (final var word : words)
					{
					//System.out.println(word);

					statement.setString(1, word);

					statement.execute();

					count++;
					}

				return Integer.valueOf(count);
				});

			System.out.println(c);
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		}

	/*
	@Override
	public <R> R transaction(final FailableSupplier<R, SQLException> supplier)
		{
		try
			{
			return super.transaction(supplier);
			}
		catch (final SQLException ex)
			{
			throw new RuntimeException(ex);
			}
		}
	*/

	public int save(final URI uri, final String html)
		{
		throw new NotImplementedException();
		}
	}
