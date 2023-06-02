package emoji;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.tuple.Pair;
import io.IO;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Emojify implements Function<String, String>
	{
	protected final List<Pair<String, String>> emojis;

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@SuppressWarnings("unchecked")
	public Emojify(final String path) throws IOException
		{
		super();

		//final var d = new ObjectReader<ArrayList<Pair<String, String>>>(new ArrayList<Pair<String, String>>().getClass());
		//final var pair = TypeToken.getParameterized(Pair.class, String.class, String.class);
		//final var list = TypeToken.getParameterized(List.class, pair.getType());
		//emojis = IO.read(path, IObjectReader.of(new ArrayList<Pair<String, String>>().getClass()));

		emojis = (List<Pair<String, String>>) IO.read(path);
		//emojis = IO.read(path, IObjectReader.of(list.getRawType()));
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Emojify(final String path, final String todoSeparator) throws IOException
		{
		throw new NotImplementedException();
		}

	/**
	 * @since 0.1.0
	 */
	public final List<Pair<String, String>> getEmojis()
		{
		return Collections.unmodifiableList(emojis);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final String replace(final String text)
		{
		var textWithEmojis = notNull(text);

		for (final var emoji : emojis)
			{
			textWithEmojis = textWithEmojis.replace(emoji.getKey(), emoji.getValue());
			}

		/*
		final var iterator = emojis.iterator();

		while (iterator.hasNext())
			{
			final var emoji = iterator.next();

			textWithEmojis = textWithEmojis.replace(emoji.getKey(), emoji.getValue());
			}
		*/

		return textWithEmojis;
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public String apply(final String text)
		{
		return replace(text);
		}
	}
