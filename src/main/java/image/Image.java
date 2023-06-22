package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import image.exceptions.InvalidImageSizeException;

import static io.IO.toFile;
//import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Image implements IImage
	{
	protected final BufferedImage image;

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Image(final String path) throws IOException
		{
		this(toFile(path));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Image(final File file) throws IOException
		{
		super();

		image = FILE_READER.apply(file);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Image(final Path path) throws IOException
		{
		this(toFile(path));
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final BufferedImage getBufferedImage()
		{
		return image;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final List<Pixel> getPixels()
		{
		return PIXELS.apply(image);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Deprecated
	public final void walk(final Consumer<Pixel> consumer)
		{
		throw new NotImplementedException();

		/*
		notNull(consumer);

		getPixels().stream().forEach(consumer);
		*/
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	protected final void checkImageSize(final int size) throws IOException
		{
		checkImageSize(size, size);
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	protected final void checkImageSize(final int width, final int height) throws IOException
		{
		if (image.getWidth() != width || image.getHeight() != height)
			{
			// TODO: Size
			throw new InvalidImageSizeException();
			}
		}
	}
