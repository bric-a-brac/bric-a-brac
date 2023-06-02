package poker.evaluator;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import game.card.Card;
import poker.evaluator.exceptions.InvalidHandException;
import util.Constant;
import util.LittleEndian;
import util.exceptions.NullArgumentException;

import static io.IO.toPath;
import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Evaluator implements IEvaluator
	{
	private static final Path DEFAULT_HAND_RANKS_PATH = Paths.get(Constant.DOT, "data", "HandRanks.dat");

	private final ByteBuffer ranks;

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Evaluator() throws IOException
		{
		this(DEFAULT_HAND_RANKS_PATH);
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Evaluator(final String path) throws IOException
		{
		this(toPath(path));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Evaluator(final File file) throws IOException
		{
		this(toPath(file));
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
	 * @throws InvalidHandException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final HandRank apply(final List<Card> cards)
		{
		notNull(cards);

		// TODO: cards.size()

		var position = 53;

		// TODO: Trier cartes ??
		//cards.sort(new poker.Card.Comparator());

		for (final Card card : cards)
			{
			position = getNewPosition(position + card.getValue() + 1);
			}

		if (cards.size() == 5 || cards.size() == 6)
			{
			position = getNewPosition(position);
			}

		final var rank = position & 0x00000FFF;
		final var type = position >> 12;
		//final var value = position;

		return new HandRank(rank, type, position);
		}

	/**
	 * @since 0.1.0
	 */
	public final int getNewPosition(final int position)
		{
		return ranks.getInt(position * 4);
		}
	}
