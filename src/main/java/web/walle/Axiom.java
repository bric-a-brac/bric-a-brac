package web.walle;

import java.net.URI;
import java.sql.SQLException;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import database.InMemoryDatabase;

/**
 * <h4>Axiom</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Axiom extends InMemoryDatabase
	{
	public Axiom() throws SQLException
		{
		super();
		}

	public int save(final URI uri, final String html)
		{
		throw new NotImplementedException();
		}
	}
