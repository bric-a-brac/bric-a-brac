package walle;

import java.util.ArrayList;
import annotations.WorkInProgress;
import html.Parser;

/**
 * <h4>WallE</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class WallE extends Client implements Runnable
	{
	private WallE()
		{
		super();
		}

	@Override
	public void run()
		{
		final var jobs = new ArrayList<String>();
		final var urls = new ArrayList<String>();

		jobs.add("https://www.ritzy.ch/");

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

	public static void main(final String[] args)
		{
		new WallE().run();
		}
	}
