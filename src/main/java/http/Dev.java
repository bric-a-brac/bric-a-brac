package http;

// HttpClient.newBuilder().connectTimeout(null).followRedirects(Redirect.ALWAYS).build();
// TODO: User-Agent
//userAgent = null;

public class Dev
	{
	public static void text()
		{
		final var text = new SimpleClient().getAsString("https://example.net/");

		System.out.println(text);
		}

	public static void html()
		{
		final var document = new SimpleClient().getAsDocument("https://example.net/");

		System.out.println(document);
		}

	public static void image()
		{
		final var image = new SimpleClient().getAsImage("https://static1.cbrimages.com/wordpress/wp-content/uploads/2021/02/Balrog-Gandalf.jpg");

		System.out.println(image);
		}

	public static void main(String[] args) throws Throwable
		{
		text();
		//html();
		//image();
		}
	}
