package io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IReader<T extends InputStream, R, E extends Exception>
	{
	/**
	 * @throws IOException
	 * @throws E
	 * 
	 * @since 0.1.0
	 */
	public R read(T input) throws IOException, E;
	}
