package xxx.babepedia;

import java.nio.file.Paths;

public class Dev
	{
	public static void babe()
		{
		//final var babe = babeParser.parse("https://www.babepedia.com/babe/Vera_Brezhneva");
		}

	public static void main(String[] args) throws Throwable
		{
		final var path = "/home/thefab/Téléchargements/babelist.txt";

		final var babepedia = new Babepedia(Paths.get(path));

		babe();

		/*
		System.out.println(babepedia.babes.containsKey("Aadie Suicide"));

		final var babe = babepedia.babes.keySet().stream().filter(name -> name.equalsIgnoreCase("Moos Claire")).findFirst();

		babe.ifPresent(name ->
			{
			final var url = babepedia.babes.get(name);

			System.out.println(url);
			});
		*/
		}
	}
