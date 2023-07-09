package wip;

import java.util.List;
import org.jsoup.nodes.Element;
import annotations.WorkInProgress;
import parser.Tokenizer;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

@WorkInProgress
public class HTML
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final <T extends Element> List<String> getWords(final T element)
		{
		return getWords(element, Tokenizer.DEFAULT);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final <T extends Element> List<String> getWords(final T element, final Tokenizer tokenizer)
		{
		notNull(element);
		notNull(tokenizer);

		return tokenizer.tokenize(element.text());
		}
	}
