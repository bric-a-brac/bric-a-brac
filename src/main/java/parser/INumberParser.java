package parser;

import org.apache.commons.lang3.NotImplementedException;

//import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface INumberParser<T extends Number> extends IStringParser<T, NumberFormatException>
	{
	/**
	 * @since 0.1.0
	 */
	public static final INumberParser<Byte> BYTE = value ->
		{
		//return Byte.parseByte("sd");
		throw new NotImplementedException();
		};

	//public static final IStringParser<Integer, IllegalArgumentException> INT = text -> {throw new NotImplementedException();};
	//public static final IStringParser<Integer, IllegalArgumentException> INTEGER = INT;
	//public static final IStringParser<Long, IllegalArgumentException> LONG = text -> {throw new NotImplementedException();};

	@Override
	default T parse(String value) throws NumberFormatException
		{
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'parse'");
		}

	/*
	public static final byte parseByte(final String value)
		{
		return BYTE.apply(value).byteValue();
		}

	public static final int parseInt(final String value)
		{
		return INT.apply(value).intValue();
		}

	public static final long parseLong(final String value)
		{
		return LONG.apply(value).longValue();
		}

	public static final float parseFloat(final String value)
		{
		throw new NotImplementedException();
		}
	*/
	}
