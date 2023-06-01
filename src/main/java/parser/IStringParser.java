package parser;

import java.util.function.BiFunction;
import org.apache.commons.text.similarity.LevenshteinDistance;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IStringParser<T, E extends Throwable> extends IParser<String, T, E>
	{
	/**
	 * @since 0.1.0
	 */
	public static final LevenshteinDistance LEVENSHTEIN_DISTANCE = LevenshteinDistance.getDefaultInstance();

	/**
	 * @since 0.1.0
	 */
	public static final BiFunction<String, String, Integer> DISTANCE = (left, right) -> LEVENSHTEIN_DISTANCE.apply(notNull(left), notNull(right));

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public default int distance(final String left, final String right)
		{
		return DISTANCE.apply(left, right).intValue();
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public default double similarity(final String left, final String right)
		{
		final var distance = distance(left, right);

		final var max = Integer.max(left.length(), right.length());

		return (max - distance) * 100.0 / max;
		}

	/*
	public static final IStringParser<List<String>, IllegalArgumentException> LINES = text ->
		{
		return Arrays.asList(notNull(text).split(Constant.END_OF_LINE_REGEX));
		};
	*/

	/**
	 * @since 0.1.0
	 * 
	 * @see https://stackoverflow.com/a/31060125
	 */
	/*
	public static final List<String> getLines(final String text /* final boolean todoSkipEmptyLinesXXXX * /)
		{
		// TODO: todoSkipEmptyLinesXXXX
		return Arrays.asList(notNull(text).split(Constant.END_OF_LINE_REGEX));
		}
	*/

	/**
	 * @since 0.1.0
	 * 
	 * @see https://stackoverflow.com/a/31060125
	 */
	/*
	public static final List<String> lines(final String text)
	{
	final var lines = Arrays.asList(notNull(text).split(Constant.END_OF_LINE_REGEX));

	return lines.stream().map(String::trim).filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
	}
	*/
	}
