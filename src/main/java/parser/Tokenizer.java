package parser;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import util.Constant;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Tokenizer implements IStringParser<List<String>, IllegalArgumentException>
	{
	public static final Tokenizer DEFAULT = new Tokenizer(Constant.SEPARATORS);

	protected final String separators;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Tokenizer(final String separators)
		{
		super();

		this.separators = notNull(separators);
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final List<String> apply(final String input)
		{
		final var tokenizer = new StringTokenizer(input, separators);

		final var tokens = new ArrayList<String>();

		while (tokenizer.hasMoreTokens())
			{
			final var token = tokenizer.nextToken();

			if (!token.isBlank())
				{
				tokens.add(token);
				}
			}

		return tokens;
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final List<String> tokenize(final String text)
		{
		return apply(notNull(text));
		}
	}
