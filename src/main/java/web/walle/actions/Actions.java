package web.walle.actions;

import java.net.URI;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import web.walle.Axiom;

//private static final Slugify SLUGIFY = Slugify.builder().lowerCase(Boolean.TRUE).locale(Locale.FRENCH).build();
//public static final FailableFunction<Document, List<String>, RuntimeException> LINKS = new LinkExtractor();
//public static final FailableFunction<List<String>, List<String>, RuntimeException> SLUG = words ->
//	{
//	return words.stream().map(SLUGIFY::slugify).collect(Collectors.toList());
//	};
//public static final FailableFunction<Document, List<String>, RuntimeException> KEYWORDS = WORDS.andThen(SLUG);

@WorkInProgress
public final class Actions
	{
	private Actions()
		{
		throw new UnsupportedOperationException();
		}

	@WorkInProgress
	public static Action<Document, URI> getKeywordExtractor(final Axiom axiom)
		{
		return new KeywordExtractor(axiom);
		}
	}
