package dictionary.dicollecte;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import dictionary.IWord;

import static util.Argument.notNull;

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

	public static Word parse(final String line)
		{
		final var tokens = notNull(line).split("[/\\t]");

		final var list = Arrays.asList(tokens);

		final var word = list.get(0);

		final var numbers = list.subList(1, list.size()).stream().map(number ->
			{
			return Integer.parseInt(number);
			});

		return new Word(word, numbers.collect(Collectors.toList()));
		}
	}
