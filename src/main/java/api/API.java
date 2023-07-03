package api;

import java.io.IOException;
import java.util.Collection;
import annotations.WorkInProgress;

@WorkInProgress
public interface API
	{
	@WorkInProgress
	public static interface IEndPoint<T>
		{
		@WorkInProgress
		public T get() throws IOException;

		@WorkInProgress
		public Collection<T> getAll() throws IOException;
		}

	@WorkInProgress
	public <T> IEndPoint<T> getEndPoint(final Class<T> classOfT);
	}
