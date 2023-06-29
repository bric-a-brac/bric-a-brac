package parser;

import java.net.URI;
import annotations.WorkInProgress;

@WorkInProgress
@FunctionalInterface
public interface IWebParser<T, E extends Throwable> extends IParser<URI, T, E>
	{
	public default T parse(final String uri) throws E
		{
		return parse(URI.create(uri));
		}
	}
