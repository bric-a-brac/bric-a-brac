package website.simple;

import java.io.IOException;
import website.builder.WebPage;
import website.builder.WebSiteBuilder;

public class Simple extends WebSiteBuilder
	{
	public void build() throws IOException
		{
		final var webpage = new WebPage();
		final var html = webpage.layout();
		System.out.println(html);
		}

	public static void main(String[] args) throws Throwable
		{
		new Simple().build();
		}
	}
