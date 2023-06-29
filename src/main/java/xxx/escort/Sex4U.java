package xxx.escort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import xxx.Client;

public final class Sex4U extends Client
	{
	public void parse(final Consumer<String> consumer) throws IOException
		{
		final var links = parseListings();
		System.out.println(links.size());
		//.forEach(consumer);
		}

	private List<String> parseListings() throws IOException
		{
		final var links = new ArrayList<String>();

		var url = "https://sex4u.ch/fr/suisse/escort-girls";

		while (url != null)
			{
			final var document = getAsDocument(url);

			final var ads = document.select("div.cat_blk_left_ads").first();

			// Ne pas prendre les pubs
			final var list = ads.select("div.bordered > ul.cat_pict > li:not(.pub_insert) > a[href]");

			// TODO: Parser.links(Elements);
			//final var a = list.select("a[href]");

			list.forEach(link ->
				{
				links.add(link.absUrl("href"));
				});

			final var pagination = ads.select("nav > ul.pagination > li.page-item");

			final var next = pagination.select("a.page-link[rel='next']").first();

			if (next != null)
				{
				url = next.absUrl("href");
				}
			else
				{
				url = null;
				}
			}

		return links;
		}

	/*
	private Escort parseEscort(final String url) throws IOException
		{
		return new Escort();
		}
	*/

	public static void main(String[] args) throws Throwable
		{
		new Sex4U().parse(escort ->
			{
			System.out.println(escort);
			});
		}
	}
