package web.walle.database;

import annotations.WorkInProgress;

@WorkInProgress
public interface IHistory //extends Iterable<IHistory.IEntry>
	{
	@WorkInProgress
	public interface IEntry
		{
		public String getHTML();

		public String getURL();
		}

	@WorkInProgress
	public IHistory.IEntry getEntry(String url);
	}
