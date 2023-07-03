package http.client;

import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

@WorkInProgress
public abstract class AbstractContentHandler<T> implements IRequest.IContentHandler<T>
	{
	@Override
	public T get()
		{
		throw new NotImplementedException();
		}
	}
