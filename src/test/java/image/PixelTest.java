package image;

import org.junit.jupiter.api.Assertions;

public class PixelTest extends Assertions
	{
	public static void testPixelColor(final Pixel pixel, final int red, final int green, final int blue)
		{
		final var color = pixel.getColor();

		assertEquals(red, color.getRed());
		assertEquals(green, color.getGreen());
		assertEquals(blue, color.getBlue());
		}
	}
