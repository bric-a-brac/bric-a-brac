package poker.statistics;

import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
final class Math3
	{
	/**
	 * @throws NullArgumentException
	 * @throws NotStrictlyPositiveException
	 * 
	 * @since 0.1.0
	 */
	/*
	@Override
	public void walk(final int count, final Consumer<Card[]> consumer)
		{
		throw new NotImplementedException();
		}
	*/

	/*
	private static final int N = 7;

	public static Map<Type, AtomicInteger> getStatistics() throws IOException
		{
		final var evaluator = new Evaluator();

		final var hands = new HashMap<Type, AtomicInteger>();

		for (final var type : Type.values())
			{
			hands.put(type, new AtomicInteger(0));
			}

		final var cards = Card.get();

		final var combinations = new Combinations(cards.size(), N);

		combinations.forEach(combination ->
			{
			final var hand = new ArrayList<Card>();

			for (final var index : combination)
				{
				hand.add(cards.get(index));
				}

			final var rank = evaluator.evaluate(hand);

			hands.get(rank.getType()).incrementAndGet();
			});

		return hands;
		}
	*/
	}
