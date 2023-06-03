package poker;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import org.apache.commons.math3.util.Combinations;
import poker.evaluator.HandRank;

public class Dev
	{
	public static void combinationsMath3()
		{
		final var combinations = new Combinations(52, 5);

		var count = 0L;

		for (final var combination : combinations)
			{
			System.out.println(Arrays.toString(combination));
			count++;
			}

		System.out.println(count);

		//combinations.forEach(combination -> {});
		}

	public static void main(String[] args) throws Throwable
		{
		//new Player<IHand<ICard>>().getHand().getCards();
		//new Player<IHand<?>>().getHand().getCards();
		//new Player<IHand<String>>().getHand().getCards();

		//Stream.of(Card.get());
		//Stream.generate(() -> "dff");
		//Stream.iterate(null, null, null);
		}
	}

class HandRanks implements Predicate<HandRank>, UnaryOperator<HandRank>
	{
	@Override
	public HandRank apply(HandRank t)
		{
		return null;
		}
	@Override
	public boolean test(HandRank t)
		{
		return false;
		}
	public Stream<HandRank> stream()
		{
		return Stream.iterate(null, this, this);
		}
	}
