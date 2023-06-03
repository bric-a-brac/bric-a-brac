package net.api;

import java.io.IOException;
import java.util.List;
import annotations.Discontinued;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Discontinued
public interface IEndPoint<T>
	{
	/**
	 * @since 0.1.0
	 */
	public T get() throws IOException;

	/**
	 * @since 0.1.0
	 */
	public List<T> getAll() throws IOException;
	}
