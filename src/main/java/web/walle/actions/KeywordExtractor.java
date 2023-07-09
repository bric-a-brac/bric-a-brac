package web.walle.actions;

import java.net.URI;
import java.util.function.BiConsumer;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import parser.Tokenizer;
import wip.HTML;

import static util.Argument.notNull;

@WorkInProgress
public final class KeywordExtractor implements BiConsumer<Document, URI>
	{
	private final Tokenizer tokenizer;

	public KeywordExtractor()
		{
		this(Tokenizer.DEFAULT);
		}

	public KeywordExtractor(final Tokenizer tokenizer)
		{
		super();

		this.tokenizer = notNull(tokenizer);
		}

	@Override
	@WorkInProgress
	public void accept(final Document document, final URI uri)
		{
		notNull(document);

		//final var words = Parser.words(document);
		final var words = HTML.getWords(document, tokenizer);

		System.out.println(words);
		}
	}
