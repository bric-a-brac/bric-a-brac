package dictionary;

import java.util.Collections;
import java.util.Map;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class AbstractDictionary<T extends IWord> implements IDictionary<T>
	{
	protected final Map<String, T> words;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	protected AbstractDictionary(final Map<String, T> words)
		{
		super();

		this.words = notNull(words);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final Map<String, T> getWords()
		{
		return Collections.unmodifiableMap(words);
		}
	}
