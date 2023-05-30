package image;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import image.exceptions.InvalidImageException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Image
	{
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
	}
