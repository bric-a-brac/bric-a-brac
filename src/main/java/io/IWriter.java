package io;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IWriter<T extends OutputStream>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public void write(T output) throws IOException;
	}
