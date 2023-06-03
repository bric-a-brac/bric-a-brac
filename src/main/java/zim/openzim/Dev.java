package zim.openzim;

import java.io.IOException;

public class Dev
	{
	public static void zim() throws IOException
		{
		final var path = "wikipedia_fr_all_nopic_2023-04.zim";

		final var file = new File(path);

		try (final var reader = file.read())
			{
			//System.out.println(reader);
			}
		}

	public static void main(String[] args) throws Throwable
		{
		zim();
		}
	}
