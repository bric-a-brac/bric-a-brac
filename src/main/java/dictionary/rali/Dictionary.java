package dictionary.rali;

import java.util.Map;
import dictionary.AbstractDictionary;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Dictionary extends AbstractDictionary<Word>
	{
	protected Dictionary(final Map<String, Word> words)
		{
		super(words);
		}
	}
