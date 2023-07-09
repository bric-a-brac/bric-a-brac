package web.walle.actions;

import java.net.URI;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.NotImplementedException;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import parser.Tokenizer;
import web.walle.Axiom;
import wip.HTML;

import static util.Argument.notNull;

/*
	private static final Slugify SLUGIFY = Slugify.builder().lowerCase(Boolean.TRUE).locale(Locale.FRENCH).build();

	public static final FailableFunction<Document, List<String>, RuntimeException> LINKS = new LinkExtractor();

	

	public static final FailableFunction<List<String>, List<String>, RuntimeException> SLUG = words ->
		{
		return words.stream().map(SLUGIFY::slugify).collect(Collectors.toList());
		};

	public static final FailableFunction<Document, List<String>, RuntimeException> KEYWORDS = WORDS.andThen(SLUG);
	*/

@WorkInProgress
public final class Actions
	{
	//public static final BiConsumer<Document, URI> KEYWORDS = new KeywordExtractor();
	//public static final BiConsumer<Document, URI> WORDS = null;
	//public static final BiConsumer<Document, URI> ALL = KEYWORDS.andThen(WORDS);

	private Actions()
		{
		throw new UnsupportedOperationException();
		}

	@WorkInProgress
	public static final BiConsumer<Document, URI> getKeywordExtractor(final Axiom axiom)
		{
		return getKeywordExtractor(axiom, Tokenizer.DEFAULT);
		}

	@WorkInProgress
	public static final BiConsumer<Document, URI> getKeywordExtractor(final Axiom axiom, final Tokenizer tokenizer)
		{
		notNull(axiom);
		notNull(tokenizer);

		return (document, uri) ->
			{
			final var words = HTML.getWords(document, tokenizer);

			axiom.saveWords(words);
			};
		}
	}
