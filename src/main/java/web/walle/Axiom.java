package web.walle;

import java.nio.file.Paths;
import java.util.List;
import annotations.WorkInProgress;
import database.SQLite;
import database.exceptions.DatabaseException;

//import static util.Argument.notEmpty;
import static util.Argument.notNull;

/**
 * <h4>Axiom</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Axiom extends SQLite
	{
	/**
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	public Axiom()
		{
		super(Paths.get("walle.sqlite"));

		execute("CREATE TABLE word (TEXT word NOT NULL)");

		/*
		try
			{
			getConnection().createStatement().execute("CREATE TABLE word (TEXT word NOT NULL);");
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		*/
		}

	@WorkInProgress
	public void saveWords(final List<String> words)
		{
		notNull(words);

		final var statement = getPreparedStatement("INSERT INTO word VALUES (?)");

		transaction(() ->
			{
			for (final var word : words)
				{
				statement.setString(1, word);

				statement.execute();
				}

			return null;
			});
		}

	/*
	public int save(final URI uri, final String html)
		{
		throw new NotImplementedException();
		}
	*/
	}
