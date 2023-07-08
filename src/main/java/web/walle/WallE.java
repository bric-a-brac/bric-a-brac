package web.walle;

import annotations.WorkInProgress;
import web.walle.actions.KeywordExtractor;
import web.walle.client.Client;
import web.walle.client.exceptions.ClientException;

/**
 * <h4>WallE (WebAllEngine) ;-)</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class WallE
	{
	private final Client client;

	public WallE(final Axiom axiom)
		{
		super();

		client = new Client();
		}

	@WorkInProgress
	public void process(final String url)
		{
		try
			{
			final var document = client.get(url);
			final var keywords = new KeywordExtractor();
			keywords.execute(document);
			}
		catch (final ClientException ex)
			{
			ex.printStackTrace();
			}
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
