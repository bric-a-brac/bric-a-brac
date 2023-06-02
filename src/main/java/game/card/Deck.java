package game.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.math3.random.MersenneTwister;
import game.card.exceptions.NoMoreCardException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Deck<T extends ICard> implements IDeck<T>
	{
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
	 * Retourne les cartes du paquet.
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
	public T deal()
		{
		if (cards.isEmpty())
			{
			throw new NoMoreCardException();
			}

		return cards.remove(0);
		}

	/**
	 * @throws NoMoreCardException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public List<T> deal(int count)
		{
		// TODO: count > 0

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
		final var random = new MersenneTwister();

		for (var i = cards.size() - 1; i > 0; i--)
			{
			//final var index = random.nextInt(i + 1);
			//final var card = cards.get(index);
			//cards.set(index, cards.get(i));
			//cards.set(i, card);

			Collections.swap(cards, i, random.nextInt(i + 1));
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
