package wip;

import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import annotations.WorkInProgress;

@WorkInProgress
public class URL
	{
	public static void fragment() throws Throwable
		{
		final var uri =  URI.create("http://www.exemple.org/path#fragment");

		final var fragment = uri.getFragment();

		System.out.println(uri);
		System.out.println(fragment);
		}

	public static void decode()
		{
		final var text = "sdds+dfsdf+sfsd+sdf+sd+fsdf";

		final var url = URLDecoder.decode(text, Charset.defaultCharset());

		System.out.println(text);
		System.out.println(url);
		}

	public static void encode()
		{
		final var text = "sdds dfsdf sfsd sdf sd fsdf";

		final var url = URLEncoder.encode(text, Charset.defaultCharset());

		System.out.println(text);
		System.out.println(url);
		}
	}
