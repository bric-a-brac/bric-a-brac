package http.client;

import java.io.IOException;
import annotations.WorkInProgress;

@WorkInProgress
public interface IClient
	{
	@WorkInProgress
	public <T> IResponse<T> get(IRequest.IGet<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> post(IRequest.IPost<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> put(IRequest.IPut<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> delete(IRequest.IDelete<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> send(IRequest<T> request) throws IOException, InterruptedException;
	}
