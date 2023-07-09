package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.function.FailableSupplier;
import annotations.WorkInProgress;
import database.exceptions.DatabaseException;
import util.Argument;
import util.exceptions.EmptyArgumentException;
import util.exceptions.NullArgumentException;

@WorkInProgress
public abstract class AbstractDatabase<T extends Connection> implements IDatabase<T>
	{
	protected final T connection;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	protected AbstractDatabase(final T connection)
		{
		super();

		this.connection = Argument.notNull(connection);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final T getConnection()
		{
		return connection;
		}

	@Override
	@WorkInProgress
	public final Optional<Integer> getLastInsertID(final PreparedStatement statement)
		{
		Argument.notNull(statement);

		try (final var keys = statement.getGeneratedKeys())
			{
			if (keys.next())
				{
				final var id = keys.getInt(1);

				if (!keys.wasNull())
					{
					return Optional.of(Integer.valueOf(id));
					}
				}

			return Optional.empty();
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		}

	@Override
	public final <R> R transaction(final FailableSupplier<R, SQLException> supplier)
		{
		Argument.notNull(supplier);

		try
			{
			getConnection().setAutoCommit(false);

			return supplier.get();
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		}

	@Override
	@WorkInProgress
	public final Function<PreparedStatement, Integer> count()
		{
		throw new NotImplementedException();
		}

	@Override
	@WorkInProgress
	public final Function<PreparedStatement, PreparedStatement> update()
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public void close()
		{
		try
			{
			connection.close();
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		}

	/**
	 * @throws NullArgumentException
	 * @throws EmptyArgumentException
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	protected static final Connection getConnection(final String connectionString)
		{
		Argument.notEmpty(connectionString);

		try
			{
			return DriverManager.getConnection(connectionString);
			}
		catch (final SQLException ex)
			{
			throw new DatabaseException(ex);
			}
		}
	}
