package game.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import game.card.exceptions.NoMoreCardException;

import static util.Argument.notNull;
import static util.Argument.strictlyPositive;

/**
 * <h4>Jeu de cartes à jouer</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Deck<T extends ICard> implements IDeck<T>
	{
	private static final RandomGenerator RANDOM = new MersenneTwister();

	protected final List<T> cards;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Deck(final Supplier<List<T>> supplier)
		{
		this(notNull(supplier).get());
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Deck(final List<T> cards)
		{
		super();

		this.cards = notNull(cards);
		}

	/**
	 * Retourne les cartes restantes du paquet.
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final List<T> getCards()
		{
		return Collections.unmodifiableList(cards);
		}

	/**
	 * @throws NoMoreCardException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final T deal()
		{
		if (cards.isEmpty())
			{
			throw new NoMoreCardException();
			}

		return cards.remove(0);
		}

	/**
	 * @throws NotStrictlyPositiveException
	 * @throws NoMoreCardException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final List<T> deal(int count)
		{
		strictlyPositive(count);

		final var cards = new ArrayList<T>();

		for (var i = 0; i < count; i++)
			{
			cards.add(deal());
			}

		return cards;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public void shuffle()
		{
		for (var i = cards.size() - 1; i > 0; i--)
			{
			Collections.swap(cards, i, RANDOM.nextInt(i + 1));
			}
		}

	/**
	 * @since 0.1.0
	 */
	public static final Deck<Card> get()
		{
		return new Deck<>(Card.get());
		}
	}
