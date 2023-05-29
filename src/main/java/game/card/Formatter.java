package game.card;

import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Formatter
	{
	public static final Formatter CARDS = new Formatter();

	private final String[] symbols;

	/**
	 * @since 0.1.0
	 */
	public Formatter()
		{
		this(ICard.getCards());
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Formatter(final String[] symbols)
		{
		super();

		this.symbols = notNull(symbols);
		}

	/**
	 * @since 0.1.0
	 */
	public final String[] getSymbols()
		{
		return symbols;
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final String format(final ICard card)
		{
		return symbols[notNull(card).getValue()];
		}
	}
