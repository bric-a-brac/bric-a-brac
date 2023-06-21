package emoji;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.jsoup.nodes.Document;
import http.SimpleClient;
import io.IO;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Downloader
	{
	private static final String URL = "https://unicode.org/emoji/charts/full-emoji-list.html";

	private static final String STRANGE = "⊛";

	private Downloader()
		{
		throw new UnsupportedOperationException();
		}

	public static void download() throws IOException
		{
		final var document = new SimpleClient().getAsDocument(URI.create(URL));

		final var emojis = parse(document);

		IO.write("emojis.dat", emojis);
		}

	private static List<Pair<String, String>> parse(final Document document)
		{
		final var emojis = new ArrayList<Pair<String, String>>();

		parse(document, (name, emoji) ->
			{
			if ((!name.contains(STRANGE)) && (!emoji.contains(STRANGE)))
				{
				emojis.add(new ImmutablePair<>(name, emoji));
				}
			});

		return emojis;
		}

	private static void parse(final Document document, final BiConsumer<String, String> consumer)
		{
		document.select("tr").forEach(row ->
			{
			final var chars = row.selectFirst("td.chars");

			if (chars != null)
				{
				final var name = row.selectFirst("td.name");

				consumer.accept(name.text(), chars.text());
				}
			});
		}

	public static void main(String[] args) throws Throwable
		{
		download();
		}
	}
