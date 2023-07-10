package web.walle.database;

import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;
import database.SQLite;
import database.exceptions.DatabaseException;
import util.exceptions.NullArgumentException;

import static util.Argument.notEmpty;
import static util.Argument.notNull;

@WorkInProgress
public class Database extends SQLite
	{
	/**
	 * @throws NullArgumentException
	 * @throws DatabaseException
	 * 
	 * @since 0.1.0
	 */
	public Database(final Path path)
		{
		super(path);
		}

	@WorkInProgress
	public final IJobs getJobs()
		{
		return new Jobs();
		}

	@WorkInProgress
	private final int getCount(final String table)
		{
		notEmpty(table);

		return (int) query("SELECT COUNT(*) FROM " + table, records ->
			{
			if (!records.next())
				{
				throw new IllegalStateException("!records.next()");
				}

			final var count = records.getInt(1);

			return Integer.valueOf(count);
			});
		}

	@WorkInProgress
	private final boolean hasRecords(final String table)
		{
		return getCount(table) > 0;
		}

	@WorkInProgress
	private final <R> R queryFirst(final String table, final FailableFunction<ResultSet, R, SQLException> mapper)
		{
		notEmpty(table);
		notNull(mapper);

		return query("SELECT * FROM " + table + " LIMIT 1", records ->
			{
			if (!records.next())
				{
				return null;
				}

			return mapper.apply(records);
			});
		}

	@WorkInProgress
	private final class Jobs implements IJobs
		{
		@Override
		@WorkInProgress
		public void add(final String url)
			{
			throw new NotImplementedException();
			}

		@Override
		@WorkInProgress
		public boolean hasNext()
			{
			return hasRecords("job");
			}

		@Override
		@WorkInProgress
		public IJob next()
			{
			return queryFirst("job", record ->
				{
				final var url = record.getString(1);

				return new IJob()
					{
					@Override
					public void process()
						{
						System.out.println("IJob.process: " + url);
						}
					};
				});
			}
		}
	}
