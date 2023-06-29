package xxx.escort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.jsoup.nodes.Document;
import html.Parser;
import xxx.Client;

import static util.Argument.notNull;

public final class GenevaGirls extends Client
	{
	public void parse(final Consumer<Escort> consumer) throws IOException
		{
		notNull(consumer);

		final var salons = Arrays.asList
			(
			"https://www.geneva-girls.ch/salon-geneva-girls-i",
			"https://www.geneva-girls.ch/villa-royale-geneva-girls-ii",
			"https://www.geneva-girls.ch/villa-geneva-girls-iii",
			"https://www.geneva-girls.ch/salon-geneva-girls-iv",
			"https://www.geneva-girls.ch/new-salon-geneva-girls-v",
			"https://www.geneva-girls.ch/salon-geneva-girls-vi",
			"https://www.geneva-girls.ch/club-de-lamour"
			);

		for (final var salon : salons)
			{
			//get.andThen(this::parseSalon).apply(salon).forEach(consumer);

			get(salon, this::parseSalon).forEach(consumer);
			}
		}

	private List<Escort> parseSalon(final Document document) throws IOException
		{
		final var girls = document.select("div.girl-list-row").first();

		final var links = Parser.links(girls);

		final var escorts = new ArrayList<Escort>();

		for (final var link : links)
			{
			escorts.add(get(link, this::parseEscort));
			}

		return escorts;
		}

	private Escort parseEscort(final Document document) throws IOException
		{
		final var girl = document.select("div.girl-single").first();

		final var rows = girl.select("div.girl-single-row");

		final var name = rows.get(0).select("div.girl-name").first().text();

		@SuppressWarnings("unused")
		final var photos = rows.get(1);

		final var services = rows.get(2).select("div").get(1).select("li");
		//System.out.println(services.size());

		final var escort = new Escort();

		escort.name = name;
		escort.services = Parser.list(services);

		return escort;
		}

	public static void main(String[] args) throws Throwable
		{
		new GenevaGirls().parse(escort ->
			{
			System.out.println(escort.name);
			System.out.println(escort.services);
			});
		}
	}
