package poker.statistics;

import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import poker.dev.Evaluator;

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

	//final var cards = Card.get().stream().map(IFormatter.DEFAULT::toString).collect(Collectors.toList()).toArray(new String[0]);
	}
