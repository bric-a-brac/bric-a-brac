package dictionary.grammalecte;

import java.io.IOException;
import java.util.Map;
import org.apache.commons.math3.exception.NullArgumentException;
import dictionary.AbstractDictionary;
import dictionary.parser.IParser;
import util.Constant;

import static io.IO.toPath;
import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Dictionary extends AbstractDictionary<Word>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Dictionary() throws IOException
		{
		this(parser().parse(toPath("../../../Téléchargements/Dico/dictionaries/fr-classique.dic")));
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	private Dictionary(final Map<String, Word> words)
		{
		super(words);
		}

	// Y'a des doublons !!!!!!!!!!! ex. zinzin... OK avec distinct() ;-) mais c'est peut-être que dans dico réforme ??

	/**
	 * @since 0.1.0
	 */
	private static final IParser<Word> parser()
		{
		return line ->
			{
			final var tokens = notNull(line).split(Constant.SLASH);

			if (tokens.length == 1)
				{
				return new Word(tokens[0]);
				}

			return new Word(tokens[0], tokens[1]);
			};
		}
	}
