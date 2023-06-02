package html;

import java.awt.Color;
import org.apache.commons.math3.exception.NullArgumentException;
import image.Pixel;
import util.Constant;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class WebColor
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final String toString(final Color color)
		{
		notNull(color);

		return String.format(Constant.HTML_COLOR_FORMAT, color.getRed(), color.getGreen(), color.getBlue());
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final String toString(final Pixel pixel)
		{
		return toString(notNull(pixel).getColor());
		}
	}
