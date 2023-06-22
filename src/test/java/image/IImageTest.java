package image;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IImageTest extends Assertions
	{
	private static final File IMAGE_PNG = new File("tests/image/image.png");

	@Test
	public void testFileReader() throws IOException
		{
		final var image = IImage.FILE_READER.apply(IMAGE_PNG);

		assertNotNull(image);
		}

	@Test
	public void testBytesReader() throws IOException
		{
		final var bytes = Files.readAllBytes(IMAGE_PNG.toPath());

		final var image = IImage.BYTES_READER.apply(bytes);

		assertNotNull(image);
		}

	@Test
	public void testGetPixels() throws IOException
		{
		final var image = IImage.FILE_READER.apply(IMAGE_PNG);

		//final var pixels = IImage.FILE_READER.andThen(IImage.PIXELS).apply(IMAGE_PNG);
		final var pixels = IImage.PIXELS.apply(image);

		assertNotNull(pixels);
		assertEquals(6, pixels.size());

		PixelTest.testPixelColor(pixels.get(0), 240, 219, 27);

		PixelTest.testPixelColor(pixels.get(4), 96, 223, 57);
		}
	}
