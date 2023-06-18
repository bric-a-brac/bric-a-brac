package poker.evaluator;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.math3.exception.NullArgumentException;
import poker.evaluator.exceptions.InvalidCombinationException;
import util.LittleEndian;

import static util.Argument.notNull;

/**
 * <h4>Évaluateur de combinaisons de poker</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Evaluator implements IEvaluator
	{
	private final ByteBuffer ranks;

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Evaluator() throws IOException
		{
		this(Paths.get("HandRanks.dat"));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Evaluator(final Path path) throws IOException
		{
		super();

		ranks = LittleEndian.toByteBuffer(path);
		}

	/**
	 * @throws NullArgumentException
	 * @throws InvalidCombinationException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final Combination apply(final int[] values)
		{
		notNull(values);

		// TODO: cards.size()

		var position = 53;

		for (final var value : values)
			{
			position = getNewPosition(position + value);
			}

		if (values.length == 5 || values.length == 6)
			{
			position = getNewPosition(position);
			}

		return new Combination(position);
		}

	/**
	 * @since 0.1.0
	 */
	protected final int getNewPosition(final int position)
		{
		return ranks.getInt(position * 4);
		}
	}
