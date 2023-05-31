package dictionary.grammalecte;

import java.util.Map;
import dictionary.AbstractDictionary;
import util.exceptions.NullArgumentException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Dictionary extends AbstractDictionary<Word>
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	private Dictionary(final Map<String, Word> words)
		{
		super(words);
		}
	}
