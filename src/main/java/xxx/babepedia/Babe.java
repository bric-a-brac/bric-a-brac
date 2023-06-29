package xxx.babepedia;

import java.util.Map;
import java.util.function.Function;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import annotations.WorkInProgress;
import parser.IParser;

@WorkInProgress
public class Babe
	{
	public String name;
	public String url;
	}

final class Parser implements IParser<Document, Babe, RuntimeException>
	{
	@Override
	public Babe apply(final Document document)
		{
		bio(document);
		return null;
		}

	private void bio(final Document document)
		{
		final var elements = document.select("#biolist li");

		//elements.stream().map(element -> Map.entry(null, null));
		//items.stream().map(null)
		//Map.entry(null, null);

		elements.forEach(element ->
			{
			final var label = element.selectFirst("span").text();
			});
		}
	}
