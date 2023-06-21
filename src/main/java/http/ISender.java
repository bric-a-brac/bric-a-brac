package http;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import org.apache.commons.lang3.function.FailableBiFunction;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface ISender<T> extends FailableBiFunction<HttpRequest, BodyHandler<T>, HttpResponse<T>, IOException>
	{
	}
