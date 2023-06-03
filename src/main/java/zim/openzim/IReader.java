package zim.openzim;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IReader extends AutoCloseable
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public void close() throws IOException;
	}
