package xxx.babepedia;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.lang3.NotImplementedException;
import parser.IWebParser;

// https://www.babepedia.com/babelist.txt

@SuppressWarnings("unused")
public class Babepedia
	{
	private final Client client;
	//private final IWebParser<Babe, IOException> babeParser;

	protected final Map<String, String> babes;

	public Babepedia(final Path babelist) throws IOException
		{
		super();

		client = new Client();
		//babeParser = new BabeParser();

		babes = parse(babelist);

		System.out.println(babes.size());
		}

	private static final Map<String, String> parse(final Path path) throws IOException
		{
		final var babes = new HashMap<String, String>();

		// 9harlotte99|https://www.babepedia.com/babe/9harlotte99|9harlotte99 at Babepedia

		try (final var reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1))
			{
			final var format = CSVFormat.Builder.create().setDelimiter("|").build();

			try (final var parser = CSVParser.parse(reader, format))
				{
				parser.forEach(record ->
					{
					babes.put(record.get(0), record.get(1));
					});
				}
			}

		return babes;
		}
	}
