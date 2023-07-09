package web.walle.actions;

import java.net.URI;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import parser.Tokenizer;
import util.exceptions.NullArgumentException;
import web.walle.Axiom;
import wip.HTML;

import static util.Argument.notNull;

@WorkInProgress
public final class KeywordExtractor extends Action<Document, URI>
	{
	private final Tokenizer tokenizer;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public KeywordExtractor(final Axiom axiom)
		{
		this(axiom, Tokenizer.DEFAULT);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public KeywordExtractor(final Axiom axiom, final Tokenizer tokenizer)
		{
		super(axiom);

		this.tokenizer = notNull(tokenizer);
		}

	@Override
	@WorkInProgress
	public void accept(final Document document, final URI uri)
		{
		final var words = HTML.getWords(document, tokenizer);

		axiom.saveWords(words);
		}

	/*
	public void accept(final Document document, final URI uri)
		{
		notNull(document);

		//final var words = Parser.words(document);
		final var words = HTML.getWords(document, tokenizer);

		System.out.println(words);
		}
	*/
	}
