package poker.statistics;

import annotations.WorkInProgress;
import game.card.Card;

/**
 * <h4>Statistiques Poker<h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Statistics
	{
	/**
	 * @since 0.1.0
	 */
	public static Card[] getCards()
		{
		return Card.get().toArray(new Card[0]);
		}

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public static final class Builder
		{
		//Provider
		}

	/*
	@Deprecated
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
	}
