package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.function.FailableCallable;
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

	/**
	 * @since 0.1.0
	 */
	public Optional<Integer> getLastInsertID(PreparedStatement statement);

	/**
	 * @since 0.1.0
	 */
	public PreparedStatement getPreparedStatement(String sql);

	/**
	 * @since 0.1.0
	 */
	public boolean execute(String sql);

	/**
	 * @since 0.1.0
	 */
	public <R> R transaction(FailableCallable<R, SQLException> callable);

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
