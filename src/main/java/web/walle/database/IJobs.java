package web.walle.database;

import java.util.Iterator;
import annotations.WorkInProgress;

@WorkInProgress
public interface IJobs extends Iterator<IJobs.IJob>
	{
	@WorkInProgress
	public static interface IJob
		{
		@WorkInProgress
		public void process();
		}

	/**
	 * @since 0.1.0
	 */
	public void add(String url);
	}
