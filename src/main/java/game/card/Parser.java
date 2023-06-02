package game.card;

import java.util.List;
import java.util.stream.Collectors;
import parser.IStringParser;
import util.Constant;

@Deprecated // Dans Card
public class Parser implements IStringParser<List<Card>, IllegalArgumentException>
	{
	private static final List<Card> DECK = Card.get();

	private static final String CARDS = String.join(Constant.EMPTY, DECK.stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()));

	@Override
	public final List<Card> apply(final String input) throws IllegalArgumentException
		{
		if ((input.length() % 2) != 0)
			{
			throw new IllegalArgumentException("Not % 2");
			}

		for (var i = 0; i < input.length(); i += 2)
			{
			System.out.println(input.substring(i, i + 2));
			final var card = input.substring(i, i + 2);
			System.out.println(CARDS.indexOf(card) / 2);
			System.out.println(DECK.get(CARDS.indexOf(card) / 2));
			}

		return null;
		}
	}
