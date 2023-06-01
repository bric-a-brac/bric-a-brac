package dictionary.dicollecte;

import java.util.List;
import dictionary.IWord;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Word implements IWord
	{
	private final String word;
	private final List<Integer> numbers;

	public Word(final String word, final List<Integer> numbers)
		{
		super();

		this.word = notNull(word);
		this.numbers = notNull(numbers);
		}

	public List<Integer> getNumbers()
		{
		return numbers;
		}

	@Override
	public String toString()
		{
		return word;
		}
	}
