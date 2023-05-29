package game.card;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public enum Rank
	{
	TWO('2'),
	THREE('3'),
	FOUR('4'),
	FIVE('5'),
	SIX('6'),
	SEVEN('7'),
	EIGHT('8'),
	NINE('9'),
	TEN('T'),
	JACK('J'),
	QUEEN('Q'),
	KING('K'),
	ACE('A');

	private final Character symbol;

	/**
	 * @since 0.1.0
	 */
	private Rank(final Character symbol)
		{
		this.symbol = symbol;
		}

	/**
	 * @since 0.1.0
	 */
	public final Character getSymbol()
		{
		return symbol;
		}
	}
