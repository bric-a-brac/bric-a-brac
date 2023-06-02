package poker.training;

import java.util.function.Predicate;

// TODO: Dans Util

/**
 * <h4>Générateur de combinaisons</h4>
 * 
 * @see {@link https://www.developpez.net/forums/d1049925/java/general-java/combinaisons-p-elements-parmi-n/}
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Combiner<T> implements Predicate<T[]>
	{
	private final int count;
	private final T[] values;

	private int[] indexes;

	/**
	 * @since 0.1.0
	 */
	public Combiner(final int count, final T[] values)
		{
		super();

		this.count = count;
		this.values = values;

		indexes = new int[count];

		for (int i = 0; i < count; i++)
			{
			indexes[i] = i;
			}
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public boolean test(T[] result)
		{
		if (indexes == null)
			{
			return false;
			}

		var resultIndex = 0;

		for (var index : indexes)
			{
			result[resultIndex++] = values[index];
			}

		var indexesRank = count - 1;
		var arrayRank = values.length - 1;

		while (indexes[indexesRank] == arrayRank)
			{
			if (indexesRank == 0)
				{
				indexes = null;

				return true;
				}

			indexesRank--;
			arrayRank--;
			}

		var restartIndex = indexes[indexesRank] + 1;

		while (indexesRank < count)
			{
			indexes[indexesRank++] = restartIndex++;
			}

		return true;
		}
	}
