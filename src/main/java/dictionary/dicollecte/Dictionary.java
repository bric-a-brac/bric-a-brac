package dictionary.dicollecte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import dictionary.AbstractDictionary;
import dictionary.parser.IParser;

import static io.IO.toPath;
import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Dictionary extends AbstractDictionary<Word>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Dictionary() throws IOException
		{
		super(parser().parse(toPath("../../../Téléchargements/softmaker-hunspell-french-modern-101/fr-moderne.dic")));
		}

	/**
	 * @since 0.1.0
	 */
	public Map<Integer, List<String>> getWordsByNumber(final int index)
		{
		// TODO: Check index

		final var words = new HashMap<Integer, List<String>>();

		// words.computeIfAbsent(null, null);

		this.words.forEach((key, word) ->
			{
			if (word.getNumbers().size() > index)
				{
				final var number = word.getNumbers().get(index);

				if (!words.containsKey(number))
					{
					words.put(number, new ArrayList<String>());
					}

				words.get(number).add(word.toString());
				}
			});

		return words;
		}

	/**
	 * @since 0.1.0
	 */
	private static final IParser<Word> parser()
		{
		return line ->
			{
			final var tokens = notNull(line).split("[/\\t]");

			final var list = Arrays.asList(tokens);

			final var word = list.get(0);

			final var numbers = list.subList(1, list.size()).stream().map(number ->
				{
				return Integer.parseInt(number);
				});

			return new Word(word, numbers.collect(Collectors.toList()));
			};
		}
	}
