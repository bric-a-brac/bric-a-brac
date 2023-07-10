package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.function.Function;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailableRunnable;
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

	@WorkInProgress
	public <R> R query(String sql, FailableFunction<ResultSet, R, SQLException> mapper);

	/**
	 * @since 0.1.0
	 */
	public void transaction(FailableRunnable<SQLException> runnable);

	/**
	 * @since 0.1.0
	 */
	public Integer count(PreparedStatement statement);

	/**
	 * @since 0.1.0
	 */
	public default Function<PreparedStatement, Integer> count()
		{
		return this::count;
		}

	@WorkInProgress
	public PreparedStatement update(PreparedStatement statement);

	@WorkInProgress
	public default Function<PreparedStatement, PreparedStatement> update()
		{
		return this::update;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public void close();
	}
