package wip;

import java.nio.charset.Charset;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public class Text
	{
	/**
	 * @throws NullArgumentException
	 */
	public static final String convert(final String text, final Charset from, final Charset to)
		{
		notNull(text);
		notNull(from);
		notNull(to);

		return new String(text.getBytes(from), to);
		}
	}
