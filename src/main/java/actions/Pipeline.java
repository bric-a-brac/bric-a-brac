package actions;

import java.util.Iterator;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

@WorkInProgress
public class Pipeline<T> implements Iterable<IAction<T>>
	{
	public Pipeline()
		{
		super();
		}

	@Override
	@WorkInProgress
	public Iterator<IAction<T>> iterator()
		{
		throw new NotImplementedException();
		}
	}
