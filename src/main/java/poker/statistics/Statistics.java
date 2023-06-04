package poker.statistics;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;
import game.card.Card;

import static util.Argument.notNull;

//final var cards = Card.get().stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()).toArray(new String[0]);

/**
 * <h4>Statistiques Poker<h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Statistics
	{
	private final IProvider provider;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Statistics(final IProvider provider)
		{
		super();

		this.provider = notNull(provider);
		}

	public void dev()
		{
		final var count = new AtomicLong(0L);

		provider.walker(5).walk(combination -> count.incrementAndGet());

		System.out.println(count);
		}

	/**
	 * @since 0.1.0
	 */
	/*
	public static Statistics hlbnet()
		{
		return new Statistics(new Hlbnet());
		}
	*/

	/**
	 * @since 0.1.0
	 */
	/*
	public static Statistics math3()
		{
		return new Statistics(new Math3());
		}
	*/

	/**
	 * @since 0.1.0
	 */
	public static Card[] getCards()
		{
		return Card.get().toArray(new Card[0]);
		}
	}

/*
	public static void board(final int c, final int n) throws IOException
		{
		final var evaluator = new Evaluator();

		final var hands = new HashMap<Type, AtomicInteger>();

		for (var type : Type.values())
			{
			hands.put(type, new AtomicInteger(0));
			}

		for (var i = 0; i < n; i++)
			{
			final var deck = Deck.get();

			deck.shuffle();

			final var cards = new ArrayList<Card>();

			cards.addAll(deck.deal(c));

			final var hand = evaluator.evaluate(cards).getType();

			hands.get(hand).getAndIncrement();
			}

		hands.forEach((type, count) ->
			{
			System.out.println(type + ": " + count + " (" + (count.get() * 100.0 / n) + "%)");
			});
		}
	*/