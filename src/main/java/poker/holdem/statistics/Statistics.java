package poker.holdem.statistics;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import combination.AbstractCombinationNK;
import poker.evaluator.Evaluator;
import poker.evaluator.ICombination;

//final var cards = Card.get().stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()).toArray(new String[0]);

/**
 * <h4>Statistiques Poker<h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class Statistics extends Evaluator
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Statistics() throws IOException
		{
		super();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Statistics(final Path path) throws IOException
		{
		super(path);
		}

	/**
	 * @since 0.1.0
	 */
	public final ICombinationsStatistics build()
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	public final void handsAndFlop()
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	public final void handsAndFlopTurn()
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	public final void handsAndFlopTurnRiver()
		{
		throw new NotImplementedException();
		}

	@SuppressWarnings("unused")
	private final class CombinationIterator implements Iterator<ICombination>
		{
		private AbstractCombinationNK dfdf;
		private Iterator<int[]> it;

		@Override
		public boolean hasNext()
			{
			it.hasNext();
			throw new NotImplementedException();
			}

		@Override
		public ICombination next()
			{
			evaluate(it.next());
			throw new NotImplementedException();
			}
		}
	}
