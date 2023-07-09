package dictionary.dicollecte;

import java.io.IOException;
import java.util.Map;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import dictionary.AbstractDictionary;

//import static io.IO.toPath;
//import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class Dictionary extends AbstractDictionary<Word>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	/*
	public Dictionary() throws IOException
		{
		super(parser().parse(toPath("../../../Téléchargements/softmaker-hunspell-french-modern-101/fr-moderne.dic")));
		}
	*/

	@WorkInProgress
	protected Dictionary(final Map<String, Word> words)
		{
		super(words);

		throw new NotImplementedException();
		}

	/*
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
	*/

	/*
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
	*/
	}
