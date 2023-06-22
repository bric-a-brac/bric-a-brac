package image;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.function.FailableFunction;
import image.exceptions.InvalidImageException;

import static util.Argument.notNull;

/**
 * <h4>IImage</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IImage
	{
	/**
	 * @since 0.1.0
	 */
	public static final Function<BufferedImage, List<Pixel>> PIXELS = image ->
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
		};

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<File, BufferedImage, IOException> FILE_READER = file ->
		{
		notNull(file);

		final var image = ImageIO.read(file);

		if (image == null)
			{
			throw new InvalidImageException();
			}

		return image;
		};

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<InputStream, BufferedImage, IOException> INPUT_STREAM_READER = input ->
		{
		notNull(input);

		final var image = ImageIO.read(input);

		if (image == null)
			{
			throw new InvalidImageException();
			}

		return image;
		};

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<byte[], BufferedImage, IOException> BYTES_READER = bytes ->
		{
		notNull(bytes);

		try (final var input = new ByteArrayInputStream(bytes))
			{
			return INPUT_STREAM_READER.apply(input);
			}
		};

	/**
	 * @since 0.1.0
	 */
	public BufferedImage getBufferedImage();

	/**
	 * @since 0.1.0
	 */
	public List<Pixel> getPixels();
	}
