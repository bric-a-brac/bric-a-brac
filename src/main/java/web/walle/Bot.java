package web.walle;

import java.util.List;
import annotations.WorkInProgress;
import util.exceptions.NullArgumentException;
import web.walle.client.Client;
import web.walle.client.exceptions.ClientException;
import web.walle.database.Database;
import wip.HTML;

import static util.Argument.notNull;

/**
 * <h4>Bot</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@SuppressWarnings("unused")
public final class Bot
	{
	private final Client client;
	private final Database database;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Bot(final Database database)
		{
		super();

		client = new Client();

		this.database = notNull(database);
		}

	@WorkInProgress
	public void processNextJob()
		{
		final var jobs = database.getJobs();

		if (jobs.hasNext())
			{
			jobs.next().process();
			}

		/*
		try
			{
			}
		catch (final Throwable throwable)
			{
			System.err.println(throwable.getLocalizedMessage());
			}
		*/
		}

	/*
	@WorkInProgress
	public void process(final List<String> urls)
		{
		notNull(urls);

		urls.forEach(this::process);
		}

	@WorkInProgress
	private void process(final String url)
		{
		try
			{
			final var document = client.get(url);

			final var words = HTML.getWords(document);

			System.out.println(words);
			}
		// TODO: http ex
		catch (final ClientException ex)
			{
			}
		}
	*/
	}
