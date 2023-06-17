package game.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import annotations.WorkInProgress;
import game.card.exceptions.CardNotFoundException;
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
	@Deprecated
	private static final RandomGenerator RANDOM = new MersenneTwister();

	protected final List<T> cards;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Deprecated
	public Deck(final Supplier<List<T>> supplier)
		{
		throw new NotImplementedException();
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
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	@WorkInProgress
	public final Optional<Integer> find(final Rank rank, final Suit suit)
		{
		notNull(rank);
		notNull(suit);

		//final Predicate<T> sameRank = card -> card.getRank() == rank;
		//final Predicate<T> sameSuit = card -> card.getSuit() == suit;
		//final var same = sameRank.and(sameSuit);

		var index = 0;

		for (final var card : cards)
			{
			if (card.getRank() == rank && card.getSuit() == suit)
				{
				return Optional.of(Integer.valueOf(index));
				}

			index++;
			}

		return Optional.ofNullable(null);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	@WorkInProgress
	public final T take(final int index)
		{
		// TODO: Check index

		return cards.remove(index);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final T take(final Rank rank, final Suit suit)
		{
		//notNull(rank);
		//notNull(suit);
		//final Predicate<T> sameRank = card -> card.getRank() == rank;
		//final Predicate<T> sameSuit = card -> card.getSuit() == suit;
		//cards.stream().filter(sameRank.and(sameSuit)).findFirst();

		return take(find(rank, suit).orElseThrow(() -> new CardNotFoundException()).intValue());
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	@WorkInProgress
	public void shuffle()
		{
		//new Shuffler.MT().shuffle(null);
		// TODO: Utiliser MT
		throw new NotImplementedException();
		/*
		for (var i = cards.size() - 1; i > 0; i--)
			{
			Collections.swap(cards, i, RANDOM.nextInt(i + 1));
			}
		*/
		}

	/**
	 * @since 0.1.0
	 */
	public static final Deck<Card> get()
		{
		return new Deck<>(Card.get());
		}
	}
