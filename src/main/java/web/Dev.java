package web;

public class Dev
	{
	public static void main(String[] args) throws Throwable
		{
		new WebSite<>("sdsdsd").parse(new IWebParser<>()
			{
			@Override
			public void onWebPage(final IWebPage webpage)
				{
				}
			});
		}
	}
