package web.walle.history;

import java.util.Iterator;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

@WorkInProgress
public final class History implements IHistory
	{
	@Override
	@WorkInProgress
	public Iterator<IEntry> iterator()
		{
		throw new NotImplementedException();
		}

	@WorkInProgress
	public final static class Entry implements IEntry
		{
		}

	@WorkInProgress
	private final class EntryIterator implements Iterator<IEntry>
		{
		@Override
		@WorkInProgress
		public boolean hasNext()
			{
			throw new NotImplementedException();
			}

		@Override
		@WorkInProgress
		public IEntry next()
			{
			throw new NotImplementedException();
			}
		}
	}
