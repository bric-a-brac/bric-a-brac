package http;

import java.io.IOException;
import annotations.WorkInProgress;

@WorkInProgress
public interface IClient
	{
	public <T> IResponse<T> send(IRequest<T> request) throws IOException, InterruptedException;
	}
