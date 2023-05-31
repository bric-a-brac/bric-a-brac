package dictionary;

import java.util.Map;

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
	}
