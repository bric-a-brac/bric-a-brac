package game.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.random.MersenneTwister;

import game.card.exceptions.NoMoreCardException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Deck<T extends ICard> implements IDeck<T>
	{
	protected final List<T> cards;

	@SuppressWarnings("unused")
	private Deck()
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @since 0.1.0
	 */
	public Deck(final Supplier<List<T>> supplier)
		{
		this(notNull(supplier).get());
		}

	/**
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

	@Override
	public void shuffle()
		{
		//MersenneTwister.
		//RandomGeneratorFactory.all().forEach(sdd -> System.out.println(sdd.name()));
		//RandomGeneratorFactory.getDefault().create();
		throw new NotImplementedException();
		}
	}
