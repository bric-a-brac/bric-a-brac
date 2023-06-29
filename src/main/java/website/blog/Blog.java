package website.blog;

import annotations.WorkInProgress;
import websitegenerator.FreeMarker;
import websitegenerator.WebSiteGenerator;

@WorkInProgress
public final class Blog
	{
	public static void main(String[] args)
		{
		try
			{
			final var engine = new FreeMarker("/templates");

			final var generator = new WebSiteGenerator(engine);

			generator.dev();
			}
		catch (final Throwable ex)
			{
			ex.printStackTrace();
			}
		}
	}
