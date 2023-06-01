package html.old;

@Deprecated
// TODO: WallE
public class WebPage
	{
	//public static final IParser<Document, List<String>, RuntimeException> LINKS = WebPage::links;

	//public static final IParser<Document, List<String>, RuntimeException> KEYWORDS = WebPage::keywords;


	/*
	public static final IParser<Document, List<String>, IllegalArgumentException> LINKS = document ->
		{
		//notNull(document);

		final var links = document.select(LINK_WITH_HREF);

		return links.stream().map(link -> link.absUrl(HREF)).collect(Collectors.toList());
		};
	*/

		/*
		final Map<String, Integer> tokens = new HashMap<>();
			if (token.length() > 1)
				{
				tokens.putIfAbsent(token, Integer.valueOf(0));

				final Integer count = tokens.get(token);

				tokens.replace(token, Integer.valueOf(count.intValue() + 1));
				}
			}
		}
	*/
	}
