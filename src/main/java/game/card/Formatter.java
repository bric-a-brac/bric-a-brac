package game.card;

import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Formatter
	{
	public static final Formatter SYMBOLS = new Formatter(ICard.getSymbols());

	private final String[] symbols;

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
		// TODO: Pas sur que ça fonctionne juste pr l'instant
		return symbols[notNull(card).getValue()];
		}
	}
