package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.function.FailableSupplier;
import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public interface IDatabase<T extends Connection> extends AutoCloseable
	{
	/**
	 * @since 0.1.0
	 */
	public T getConnection();

	@WorkInProgress
	public Optional<Integer> getLastInsertID(final PreparedStatement statement);

	@WorkInProgress
	public <R> R transaction(final FailableSupplier<R, SQLException> supplier);

	// BUG
	/*
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
	*/

	@WorkInProgress
	public Function<PreparedStatement, Integer> count();

	/*
	public default FailableFunction<PreparedStatement, Integer, SQLException> count()
		{
		return statement -> Integer.valueOf(statement.getUpdateCount());
		}
	*/

	@WorkInProgress
	public Function<PreparedStatement, PreparedStatement> update();

	/*
	public default FailableFunction<PreparedStatement, PreparedStatement, SQLException> update()
		{
		return statement ->
			{
			statement.executeUpdate();

			return statement;
			};
		}
	*/

	/**
	 * @since 0.1.0
	 */
	@Override
	public void close();
	}
