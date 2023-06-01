package image;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.imageio.ImageIO;
import image.exceptions.InvalidImageException;
import image.exceptions.InvalidImageSizeException;
import util.exceptions.NullArgumentException;

import static io.IO.toFile;
import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Image
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

		image = read(file);
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
	public final BufferedImage getBufferedImage()
		{
		return image;
		}

	/**
	 * @since 0.1.0
	 */
	public final List<Pixel> getPixels()
		{
		return getPixels(image);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final void walk(final Consumer<Pixel> consumer)
		{
		notNull(consumer);

		getPixels().stream().forEach(consumer);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final List<Pixel> getPixels(final BufferedImage image)
		{
		notNull(image);

		final var width = image.getWidth();
		final var height = image.getHeight();

		final var pixels = new ArrayList<Pixel>();

		for (var y = 0; y < height; y++)
			{
			for (var x = 0; x < width; x++)
				{
				pixels.add(new Pixel(image.getRGB(x, y), new Point(x, y)));
				}
			}

		return pixels;
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final BufferedImage read(final File file) throws IOException
		{
		final var image = ImageIO.read(notNull(file));

		if (image == null)
			{
			throw new InvalidImageException();
			}

		return image;
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final BufferedImage read(final InputStream input) throws IOException
		{
		notNull(input);

		final var image = ImageIO.read(input);

		if (image == null)
			{
			throw new InvalidImageException();
			}

		return image;
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final BufferedImage read(final byte[] bytes) throws IOException
		{
		notNull(bytes);

		try (final var input = new ByteArrayInputStream(bytes))
			{
			return read(input);
			}
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
