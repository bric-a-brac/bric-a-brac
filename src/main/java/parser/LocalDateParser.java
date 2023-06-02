package parser;

import java.time.LocalDate;
import java.util.regex.Pattern;
import org.apache.commons.math3.exception.NullArgumentException;
import parser.exceptions.InvalidDateException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class LocalDateParser implements IStringParser<LocalDate, IllegalArgumentException>
	{
	private final Pattern pattern;

	/**
	 * @throws NullArgumentException
	 * @throws PatternSyntaxException
	 * 
	 * @since 0.1.0
	 */
	public LocalDateParser(final String pattern)
		{
		super();

		this.pattern = Pattern.compile(notNull(pattern));
		}

	/**
	 * @throws NullArgumentException Si <code>input</code> est null.
	 * @throws InvalidDateException Si <code>input</code> ne peut pas être convertit en date.
	 * @throws NumberFormatException Ne devrait pas se produire, sinon regexp pas OK ;)
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final LocalDate apply(final String input)
		{
		final var matcher = pattern.matcher(notNull(input));

		if (!matcher.matches())
			{
			throw new InvalidDateException(String.format("Invalid date '%s'", input));
			}

		return LocalDate.of(Integer.valueOf(matcher.group(3)), Integer.valueOf(matcher.group(2)), Integer.valueOf(matcher.group(1)));
		}
	}
