package database.exceptions;

import java.sql.SQLException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

// LastInsertIDException

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class DatabaseException extends RuntimeException
	{
	/**
	 * @since 0.1.0
	 */
	public DatabaseException()
		{
		super();
		}

	/**
	 * @since 0.1.0
	 */
	public DatabaseException(final String message)
		{
		super(message);
		}

	/**
	 * @since 0.1.0
	 */
	public DatabaseException(final SQLException cause)
		{
		super();

		// TODO: Diff entre new Exception(cause) et initCause(cause) ???
		initCause(cause);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final synchronized Throwable initCause(final Throwable throwable)
		{
		notNull(throwable);

		// TODO: initCause

		if (throwable instanceof SQLException)
			{
			}

		return super.initCause(throwable);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final SQLException getCause()
		{
		return (SQLException) super.getCause();
		}
	}
