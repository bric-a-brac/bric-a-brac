package dictionary.parser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import org.apache.commons.math3.exception.NullArgumentException;
import dictionary.IWord;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IParser<T extends IWord> extends Function<String, T>
	{
	/**
	 * @since 0.1.0
	 */
	public default T parse(final String line)
		{
		return apply(line);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public default Map<String, T> parse(final Path path) throws IOException
		{
		final var words = new HashMap<String, T>();

		// TODO: distinct ou pas

		Files.lines(notNull(path), StandardCharsets.UTF_8).distinct().map(this).forEach(word ->
			{
			words.put(word.toString(), word);
			});

		return words;
		}
	}
