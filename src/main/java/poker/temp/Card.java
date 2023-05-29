package poker.temp;

import java.util.List;
import org.apache.commons.lang3.NotImplementedException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
// Pas besoin en fait car juste getValue() + 1
@Deprecated
public final class Card
	{
	/*
	//@Override
	public int getValue2()
		{
		return super.getValue() + 1;
		}
	*/

	public static List<Card> parse(final String value)
		{
		notNull(value);

		//final var ok = (value.length() % 2) == 0;

		//final var cards = new ArrayList<Card>();

		//cards.add(new Card(null, null));

		//Rank.valueOf(value)

		throw new NotImplementedException();
		}

	/*
	public static final Comparator<Card> COMPARE_BY_VALUE = (left, right) ->
		{
		if (left == null || right == null)
			{
			return 0;
			}

		return Integer.compare(left.getValue(), right.getValue());
		};
	*/
	}
