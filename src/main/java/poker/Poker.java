package poker;

import java.io.IOException;
import poker.evaluator.Evaluator;
import poker.evaluator.IEvaluator;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Poker
	{
	/**
	 * @since 0.1.0
	 */
	private Poker()
		{
		throw new UnsupportedOperationException();
		}

	public static IEvaluator getPokerEvaluator() throws IOException
		{
		//	private static final Path DEFAULT_HAND_RANKS_PATH = Paths.get(Constant.DOT, "data", "HandRanks.dat");
		return new Evaluator("data/HandRanks.dat");
		}
	}
