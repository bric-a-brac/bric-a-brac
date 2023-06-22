package website.blog;

import java.io.IOException;
import annotations.WorkInProgress;
import website.builder.IConfiguration;
import website.builder.WebSiteBuilder;

@WorkInProgress
public class Blog extends WebSiteBuilder implements IConfiguration
	{
	public void build() throws IOException
		{
		build(this);
		}

	public static void main(String[] args) throws Throwable
		{
		new Blog().build();

		//final var article = ODT.map(Paths.get("sdsd"));

		//final var html = article.layout();

		//System.out.println(html);

		
		}
	}
