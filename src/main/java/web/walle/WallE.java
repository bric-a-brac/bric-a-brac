package web.walle;

import java.net.URI;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import web.walle.actions.Actions;
import web.walle.client.Client;
import web.walle.history.IHistory;

import static util.Argument.notNull;

/**
 * <h4>WallE (WebAllEngine) ;-)</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class WallE
	{
	private final Axiom axiom;
	private final Client client;

	public WallE(final Axiom axiom)
		{
		super();

		this.axiom = notNull(axiom);

		client = new Client();
		}

	@WorkInProgress
	public void process(final String url)
		{
		final var document = client.get(url);

		process(document, null);
		}

	@WorkInProgress
	public void process(final IHistory.IEntry entry)
		{
		}

	@WorkInProgress
	public void process(final Document document, final URI uri)
		{
		Actions.getKeywordExtractor(axiom).accept(document, uri);
		}

	/*
	@Override
	public void run()
		{
		final var jobs = new ArrayList<String>();
		final var urls = new ArrayList<String>();

		jobs.add("");

		while (urls.size() < 25)
			{
			final var job = jobs.remove(0);

			System.out.println(job);

			urls.add(job);

			get(job).ifPresent(document ->
				{
				final var links = Parser.links(document);

				links.forEach(link ->
					{
					if (urls.indexOf(link) == -1)
						{
						jobs.add(link);
						}
					});
				});
			}
		}
	*/

		/*
		client.get(URI.create(url), (uri, html) ->
			{
			System.out.println(uri);
			System.out.println(html.length());
			});
		*/

	/*
	public static final String getPreference(final String preference)
		{
		return Util.getPreference(WallE.class, notNull(preference));
		}
	*/

	/*
		public Optional<String> get(final URI uri)
			{
			try
				{
				final var request = HttpRequest.newBuilder().GET().uri(uri).build();

				final var response = client.send(request, BodyHandlers.ofString());

				if (response.statusCode() < 400)
					{
					// Si il y a eu des redirections (!!! il faut définir followRedirects)
					//System.out.println(response.uri());
					//uri = response.uri();
					uri.resolve(response.uri());

					return Optional.of(response.body());
					}
				}
			catch (final IOException | InterruptedException ex)
				{
				}

			return Optional.empty();
			}
		*/
	}
