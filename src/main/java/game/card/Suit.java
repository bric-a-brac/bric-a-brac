package game.card;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public enum Suit
	{
	CLUB(Character.valueOf('C'), Character.valueOf('♣')),
	DIAMOND(Character.valueOf('D'), Character.valueOf('♦')),
	HEART(Character.valueOf('H'), Character.valueOf('♥')),
	SPADE(Character.valueOf('S'), Character.valueOf('♠'));

	private final Character letter;
	private final Character symbol;

	/**
	 * @since 0.1.0
	 */
	private Suit(final Character letter, final Character symbol)
		{
		this.letter = letter;
		this.symbol = symbol;
		}

	/**
	 * @since 0.1.0
	 */
	public final Character getLetter()
		{
		return letter;
		}

	/**
	 * @since 0.1.0
	 */
	public final Character getSymbol()
		{
		return symbol;
		}
	}
