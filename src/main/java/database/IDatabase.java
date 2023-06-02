package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailableSupplier;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IDatabase<T extends Connection> extends AutoCloseable
	{
	/**
	 * @since 0.1.0
	 */
	public T getConnection();

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	public default Optional<Integer> getLastInsertID(final PreparedStatement statement) throws SQLException
		{
		notNull(statement);

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
			}

		return Optional.empty();
		}

	/**
	 * @throws NullArgumentException
	 * @throws SQLException
	 * 
	 * @since 0.1.0
	 */
	// BUG
	public default <R> R transaction(final FailableSupplier<R, SQLException> supplier) throws SQLException
		{
		notNull(supplier);

		final var connection = getConnection();

		final var oldValue = connection.getAutoCommit();

		try
			{
			connection.setAutoCommit(true);

			final var result = supplier.get();

			connection.commit();

			return result;
			}
		catch (final SQLException ex)
			{
			connection.rollback();

			throw ex;
			}
		finally
			{
			connection.setAutoCommit(oldValue);
			}
		}

	/**
	 * @since 0.1.0
	 */
	public default FailableFunction<PreparedStatement, Integer, SQLException> count()
		{
		return statement -> Integer.valueOf(statement.getUpdateCount());
		}

	/**
	 * @since 0.1.0
	 */
	public default FailableFunction<PreparedStatement, PreparedStatement, SQLException> update()
		{
		return statement ->
			{
			statement.executeUpdate();

			return statement;
			};
		}

	/**
	 * @since 0.1.0
	 */
	public default FailableFunction<PreparedStatement, Optional<Integer>, SQLException> lastInsertID()
		{
		return statement -> getLastInsertID(statement);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public void close() throws SQLException;
	}
