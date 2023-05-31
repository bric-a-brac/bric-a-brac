package dictionary.dicollecte;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Dicollecte
	{
	private Dicollecte()
		{
		// https://extensions.openoffice.org/en/project/french-dictionaries
		// https://www.freeoffice.com/fr/telecharger/dictionnaires

		throw new UnsupportedOperationException();
		}

	public static void words() throws IOException
		{
		final var path = "/home/thefab/Téléchargements/softmaker-hunspell-french-modern-101/fr-moderne.dic";

		final Function<String, Word> mapper = line ->
			{
			final var tokens = line.split("[/\\t]");

			final var list = Arrays.asList(tokens);

			//final var word = list.remove(0);
			//final var numbers = list;

			return new Word(list.get(0), list.subList(1, list.size()));
			};

		final var words = Parser.parse(path, mapper);

		words.forEach((key, word) ->
			{
			final var n = word.getNumbers().size();

			if (n != 1 && n != 2)
				{
				//System.out.println(word + " -> " + word.getNumbers());
				}

			if (n == 2)
				{
				System.out.println(word + " -> " + word.getNumbers());
				}

			//System.out.println(word + " -> " + word.getNumbers());
			});
		}

	public static void main(String[] args) throws Throwable
		{
		words();
		}
	}
