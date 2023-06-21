package http;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientTest extends Assertions
	{
	@Test
	public void testGet() throws IOException
		{
		final var client = new Client();

		final var html = client.get("http://www.example.org/");

		assertNotNull(html);
		}
	}
