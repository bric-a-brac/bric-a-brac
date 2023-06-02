package html;

import java.awt.Color;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import image.Pixel;

public class WebColorTest extends Assertions
	{
	@Test
	public void test()
		{
		assertThrowsExactly(NullArgumentException.class, () ->
			{
			WebColor.toString((Color) null);
			});

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			WebColor.toString((Pixel) null);
			});

		//final var color = new Color(255, 0, 0);
		//assertEquals("#FF0000", WebColor.toString(color));

		assertEquals("#FF0000", WebColor.toString(new Color(255, 0, 0)));
		assertEquals("#00FF00", WebColor.toString(new Color(0, 255, 0)));
		assertEquals("#0000FF", WebColor.toString(new Color(0, 0, 255)));
		}
	}
