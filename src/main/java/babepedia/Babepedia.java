package babepedia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.BiConsumer;

// https://www.babepedia.com/babelist.txt

public class Babepedia
	{
	public static final void parse(final Path path, final BiConsumer<String, String> consumer) throws IOException
		{
		Files.lines(path)
			.map(line -> line.split("|"))
			//.map(values -> Arrays.asList(values[0], values[1]));
			.forEach(values -> consumer.accept(values[0], values[1]));
		}

	public static void main(String[] args) throws Throwable
		{
		//	/home/thefab/Téléchargements
		parse(Paths.get("/home/thefab/T\u00E9l\u00E9chargements/babelist.txt"), (name, url) ->
			{
			System.out.println(name);
			});
		}
	}
