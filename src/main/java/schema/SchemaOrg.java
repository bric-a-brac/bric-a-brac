package schema;

import annotations.WorkInProgress;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class SchemaOrg
	{
	//public static final IParser<Document, List<Thing>, IllegalArgumentException> PARSER = SchemaOrg::parse;

	public static final String CONTEXT = "https://schema.org";

	// RegExp
	//private static final String URL_HTTP = "http://schema.org/";
	//private static final String URL_HTTPS = "https://schema.org/";

	public static final String ITEM_PROPERTY = "itemprop";
	public static final String ITEM_SCOPE = "itemscope";
	public static final String ITEM_TYPE = "itemtype";

	public static final String TYPE = "@type";

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	/*
	public static final Elements selectTopLevelItemScopes(final Document document)
		{
		return notNull(document).select(new TopLevelHasAttributeEvaluator(ITEM_SCOPE));
		}
	*/

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	/*
	public static final Thing parse(final Element element)
		{
		notNull(element);

		final var thing = new Thing();

		thing.put(TYPE, element.attr(ITEM_TYPE));

		element.select("*[itemprop]").forEach(el ->
			{
			//System.out.println(el.attr(ITEM_PROPERTY));
			//System.out.println(el.text());
			//System.out.println(el.hasAttr(ITEM_SCOPE));
			thing.put(el.attr(ITEM_PROPERTY), el.text());
			});

		return thing;
		}
	*/

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	/*
	public static final List<Thing> parse(final Document document)
		{
		final var things = new ArrayList<Thing>();

		selectTopLevelItemScopes(document).forEach(element ->
			{
			things.add(parse(element));
			});

		return things;
		}
	*/
	}
