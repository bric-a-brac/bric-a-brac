package http;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IRequest<T>
	{
	/**
	 * @since 0.1.0
	 */
	public HttpRequest getHttpRequest();

	/**
	 * @since 0.1.0
	 */
	public BodyHandler<T> getBodyHandler();
	}
