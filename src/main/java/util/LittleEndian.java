package util;

import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class LittleEndian
	{
	private static final int MASK = 0xFF;

	/*
	public static final int twoBytesToInteger(final byte[] bytes)
		{
		notNull(bytes);

		if (bytes.length != 2)
			{
			// TODO: Error
			throw new IllegalArgumentException();
			}

		return ((bytes[0] & MASK) | ((bytes[1] & MASK) << 8));
		}
	*/

	/**
	 * @throws NullArgumentException
	 * @throws ArrayIndexOutOfBoundsException
	 * 
	 * @since 0.1.0
	 */
	public static final int twoBytesToInteger(final byte[] bytes)
		{
		return bytesToInteger(bytes, 2);
		}

	/**
	 * @throws NullArgumentException
	 * @throws ArrayIndexOutOfBoundsException
	 * 
	 * @since 0.1.0
	 */
	public static final int fourBytesToInteger(final byte[] bytes)
		{
		return bytesToInteger(bytes, 4);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final int bytesToInteger(final byte[] bytes)
		{
		notNull(bytes);

		//final var size = bytes.length;

		return 0;
		}

	/**
	 * @throws NullArgumentException
	 * @throws ArrayIndexOutOfBoundsException
	 * 
	 * @since 0.1.0
	 */
	@Deprecated
	private static final int bytesToInteger(final byte[] bytes, final int size)
		{
		System.err.println("@Deprecated LittleEndian.bytesToInteger()");

		notNull(bytes);

		if (size < 0)
			{
			throw new RuntimeException("LittleEndian.bytesToInteger() size < 0 !!!!!!!!");
			}

		if (bytes.length < size)
			{
			throw new ArrayIndexOutOfBoundsException(bytes.length);
			}

		var result = 0;

		for (var i = 0; i < size; i++)
			{
			result |= (bytes[i] & MASK) << (i * 8);
			}

		return result;
		}
	}
