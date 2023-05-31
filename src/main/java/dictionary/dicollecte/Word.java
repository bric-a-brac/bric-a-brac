package dictionary.dicollecte;

import java.util.List;
import dictionary.IWord;

import static util.Argument.notNull;

public final class Word implements IWord
	{
	private final String word;
	private final List<String> numbers;

	public Word(final String word, final List<String> numbers)
		{
		super();

		this.word = notNull(word);
		this.numbers = notNull(numbers);
		}

	public List<String> getNumbers()
		{
		return numbers;
		}

	@Override
	public String toString()
		{
		return word;
		}
	}
