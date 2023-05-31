package dictionary.grammalecte;

import dictionary.IWord;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Word implements IWord
	{
	private final String word;
	private final String charabia;

	public Word(final String word)
		{
		this(word, null);
		}

	public Word(final String word, final String charabia)
		{
		super();

		this.word = notNull(word);
		this.charabia = charabia;
		}

	public String getCharabia()
		{
		return charabia;
		}

	// Synonymous

	@Override
	public String toString()
		{
		return word;
		}
	}
