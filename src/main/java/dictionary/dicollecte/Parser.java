package dictionary.dicollecte;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import dictionary.IWord;
import io.IO;

// TODO: Fonctions communes pour parser dicos

public class Parser
	{
	public static <T extends IWord> Map<String, T> parse(final String path, final Function<String, T> mapper) throws IOException
		{
		final var words = new HashMap<String, T>();

		// TODO: distinct ou pas

		Files.lines(IO.toPath(path), StandardCharsets.UTF_8).distinct().map(mapper).forEach(word ->
			{
			words.put(word.toString(), word);
			});

		return words;
		}
	}
