package website.blog;

import java.io.IOException;
import annotations.WorkInProgress;
import website.builder.IConfiguration;
import website.builder.WebSiteBuilder;

@WorkInProgress
public final class Blog extends WebSiteBuilder
	{
	public void build() throws IOException
		{
		build(new IConfiguration()
			{
			public void asdsa()
				{
				}
			});
		}

	public static void main(String[] args) throws Throwable
		{
		new Blog().build();

		//final var builder = new WebSiteBuilder();
		//final var website = builder.build(configuration);
		//System.out.println(website);
		//builder.build(configuration);
		}
	}
