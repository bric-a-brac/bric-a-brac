package http.client;

import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

@WorkInProgress
public class Response<T> implements IResponse<T>
	{
	@Override
	public T getContent()
		{
		throw new NotImplementedException();
		}
	}
