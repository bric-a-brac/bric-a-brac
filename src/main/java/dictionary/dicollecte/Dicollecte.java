package dictionary.dicollecte;

import java.io.IOException;

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
		final var dictionary = new Dictionary();

		System.out.println(dictionary.getWord(null));
		System.out.println(dictionary.getWord("éléphant"));
		System.out.println(dictionary.getWord("maison"));

		/*
		final var numbers = new HashSet<Integer>();

		words.forEach((key, word) ->
			{
			final var n = word.getNumbers().size();

			if (n != 1 && n != 2)
				{
				//System.out.println(word + " -> " + word.getNumbers());
				}

			if (n > 1)
				{
				//System.out.println(word + " -> " + word.getNumbers());
				numbers.add(word.getNumbers().get(1));
				}

			//System.out.println(word + " -> " + word.getNumbers());
			});

		numbers.stream().sorted().forEach(number -> System.out.println(number));
		*/
		}

	public static void main(String[] args) throws Throwable
		{
		words();
		}
	}
