package dictionary;

import java.util.Map;
import java.util.Optional;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IDictionary<T extends IWord>
	{
	/**
	 * @since 0.1.0
	 */
	public Map<String, T> getWords();

	/**
	 * @since 0.1.0
	 */
	public Optional<T> getWord(final String word);
	}
