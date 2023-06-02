package image;

import java.awt.Color;
import java.awt.Point;
import java.util.function.IntFunction;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Pixel
	{
	protected final Color color;
	protected final Point position;

	public static final IntFunction<Color> INT_TO_COLOR = Pixel::intToColor; //value -> intToColor(value);

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Pixel(final Color color, final Point position)
		{
		super();

		this.color = notNull(color);
		this.position = notNull(position);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Pixel(final int color, final Point position)
		{
		this(intToColor(color), position);
		}

	/**
	 * @since 0.1.0
	 */
	public final Color getColor()
		{
		return color;
		}

	/**
	 * @since 0.1.0
	 */
	public final Point getPosition()
		{
		return position;
		}

	/*
	@Override
	public String toString()
		{
		return String.format("%s[color:%s,position:%s]", getClass().getCanonicalName(), color, position);
		}
	*/

	/**
	 * @since 0.1.0
	 */
	public static final Color intToColor(final int value)
		{
		//final int blue = pixel & 0xFF;
		//final int green = (pixel & 0xFF00) >> 8;
		//final int red = (pixel & 0xFF0000) >> 16;
		//final int alpha = (color & 0xFF000000) >>> 24;
		//return new Color(red, green, blue);

		return new Color((value & 0xFF0000) >> 16, (value & 0xFF00) >> 8, value & 0xFF);
		}

	/**
	 * @since 0.1.0
	 */
	public static final Color intToColor(final int value, final boolean withAlpha)
		{
		if (withAlpha)
			{
			}

		throw new NotImplementedException();
		}
	}
