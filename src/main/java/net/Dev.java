package net;

import java.io.IOException;
import java.net.URI;

public class Dev
	{
	public static void image() throws IOException
		{
		final var image = new SimpleClient().getAsImage(URI.create("https://static1.cbrimages.com/wordpress/wp-content/uploads/2021/02/Balrog-Gandalf.jpg"));

		System.out.println(image);
		}

	public static void main(String[] args) throws Throwable
		{
		image();
		}
	}
