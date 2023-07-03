package http.client;

import java.net.http.HttpRequest;
import annotations.WorkInProgress;

@WorkInProgress
public abstract interface IRequest<T>
	{
	@WorkInProgress
	public static interface IContentHandler<T>
		{
		@WorkInProgress
		public T get();
		}

	@WorkInProgress
	public static interface IGet<T> extends IRequest<T>
		{
		}

	@WorkInProgress
	public static interface IPost<T> extends IRequest<T>
		{
		}

	@WorkInProgress
	public static interface IPut<T> extends IRequest<T>
		{
		}

	@WorkInProgress
	public static interface IDelete<T> extends IRequest<T>
		{
		}

	@WorkInProgress
	public HttpRequest getHttpRequest();
	}
