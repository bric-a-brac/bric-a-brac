package zim.openzim;

import java.io.IOException;
import org.apache.commons.math3.exception.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class File extends java.io.File
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public File(final String path)
		{
		super(notNull(path));
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final Reader read() throws IOException
		{
		return new Reader(this);
		}
	}
