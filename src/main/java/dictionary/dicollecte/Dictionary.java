package dictionary.dicollecte;

import java.io.IOException;
import java.util.Optional;
import dictionary.AbstractDictionary;

public class Dictionary extends AbstractDictionary<Word>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Dictionary() throws IOException
		{
		super(Parser.parse("../../../Téléchargements/softmaker-hunspell-french-modern-101/fr-moderne.dic", Word::parse));
		}

	// TODO: Dans AbstractDictionary
	public final Optional<Word> getWord(final String word)
		{
		return Optional.ofNullable(words.get(word));
		}
	}
