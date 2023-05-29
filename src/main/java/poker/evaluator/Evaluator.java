package poker.evaluator;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import game.card.Card;
import poker.evaluator.exceptions.InvalidHandException;
import util.Constant;
import util.exceptions.NullArgumentException;

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
		this(Paths.get(notNull(path)));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Evaluator(final File file) throws IOException
		{
		this(notNull(file).toPath());
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

		ranks = getHandRanks(path);
		}

	/**
	 * @throws NullArgumentException
	 * @throws InvalidHandException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final Hand apply(final List<Card> cards)
		{
		notNull(cards);

		// TODO: cards.size()

		var position = 53;

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

		return new Hand(rank, type, position);
		}

	/**
	 * @since 0.1.0
	 */
	private final int getNewPosition(final int position)
		{
		return ranks.getInt(position * 4);
		}

	/**
	 * Retourne les bytes d'un fichier au format little endian.
	 * 
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	private static final ByteBuffer getHandRanks(final Path path) throws IOException
		{
		final var bytes = Files.readAllBytes(notNull(path));

		final var buffer = ByteBuffer.wrap(bytes);

		buffer.order(ByteOrder.LITTLE_ENDIAN);

		return buffer;
		}
	}
