package searchengine;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class Dev
	{
	public static void url() throws Throwable
		{
		final var url =  new URL("sds");
		final var uri = url.toURI();

		uri.getFragment();

		uri.toURL();
		}

	public static void decode()
		{
		var url = "sdds dfsdf sfsd sdf sd fsdf";
		System.out.println(url);

		url = URLEncoder.encode(url, Charset.defaultCharset());
		System.out.println(url);

		url = URLDecoder.decode(url, Charset.defaultCharset());
		System.out.println(url);
		}

	public static void main(String[] args) throws Throwable
		{
		url();
		}
	}
