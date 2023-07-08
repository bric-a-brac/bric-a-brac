package emoji;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import http.client.SimpleClient;
import io.IO;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Downloader implements Supplier<List<Pair<String, String>>>
	{
	private static final String STRANGE = "⊛";

	private Downloader()
		{
		super();
		}

	@Override
	public List<Pair<String, String>> get()
		{
		final var url = "https://unicode.org/emoji/charts/full-emoji-list.html";

		final var document = new SimpleClient.Document().get(URI.create(url));

		final var emojis = new ArrayList<Pair<String, String>>();

		document.select("tr").forEach(row ->
			{
			final var chars = row.selectFirst("td.chars");

			if (chars != null)
				{
				final var name = row.selectFirst("td.name").text();

				final var emoji = chars.text();

				if ((!name.contains(STRANGE)) && (!emoji.contains(STRANGE)))
					{
					emojis.add(new ImmutablePair<>(name, emoji));
					}
				}
			});

		return emojis;
		}

	public static void main(String[] args) throws IOException
		{
		final var emojis = new Downloader().get();

		System.out.println(emojis);
		//IO.write("emojis.dat", emojis);
		}
	}
