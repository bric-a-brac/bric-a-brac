package zim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.Discontinued;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Discontinued
@SuppressWarnings("unused")
public class Reader extends RandomAccessFile
	{
	private long position = -1;

	/**
	 * @throws NullArgumentException
	 * @throws FileNotFoundException
	 * 
	 * @since 0.1.0
	 */
	public Reader(final File file) throws FileNotFoundException
		{
		super(notNull(file), "r");
		}

	/**
	 * @throws NullArgumentException
	 * @throws FileNotFoundException
	 * 
	 * @since 0.1.0
	 */
	public Reader(final String path) throws FileNotFoundException
		{
		super(notNull(path), "r");
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final void mark() throws IOException
		{
		position = getFilePointer();
		}
	}
