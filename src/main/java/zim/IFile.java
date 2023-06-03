package zim;

import java.io.IOException;
import java.util.List;
import annotations.Discontinued;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Discontinued
public interface IFile extends IHeader, AutoCloseable
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public List<String> getURLs() throws IOException;

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public void close() throws IOException;
	}
