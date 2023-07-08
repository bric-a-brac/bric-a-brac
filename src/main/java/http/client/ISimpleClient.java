package http.client;

import java.net.URI;
import java.util.function.Consumer;
import java.util.function.Function;
import annotations.WorkInProgress;

@WorkInProgress
public interface ISimpleClient<T>
	{
	@WorkInProgress
	public T get(URI uri);

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default T get(final String uri)
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default <R> R get(final URI uri, final Function<T, R> mapper)
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default <R> R get(final String uri, final Function<T, R> mapper)
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default void get(final URI uri, final Consumer<T> consumer)
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @throws UnsupportedOperationException
	 * 
	 * @since 0.1.0
	 */
	public default void get(final String uri, final Consumer<T> consumer)
		{
		throw new UnsupportedOperationException();
		}
	}
