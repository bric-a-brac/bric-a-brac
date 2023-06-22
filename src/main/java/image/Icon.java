package image;

import java.io.IOException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Icon extends Image implements IIcon
	{
	protected final int size;

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Icon(final String path, final int size) throws IOException
		{
		super(path);

		checkImageSize(size);

		this.size = size;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getSize()
		{
		return size;
		}
	}
