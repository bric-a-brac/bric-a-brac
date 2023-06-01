package dictionary.rali;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Map;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.lang3.NotImplementedException;

import dictionary.parser.IParser;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Dictionary
	{
	/*
	M
	no
	réflexif
	exclamatif
	interrogatif
	h-aspiré
	CONT
	DOM
	OP
	SENS
	OP1
	CA
	*/

	public static final IParser<Word> parser()
		{
		return new IParser<Word>()
			{
			@Override
			public Map<String, Word> parse(final Path path) throws IOException
				{
				// TODO: Constnat TAB
				final var format = CSVFormat.Builder.create().setHeader().setDelimiter('\t').build();

				try (final var parser = CSVParser.parse(path, StandardCharsets.UTF_8, format))
					{
					parser.getHeaderNames().forEach(header ->
						{
						System.out.println(header);
						});

					/*
					final var words = new ArrayList<String>();

					parser.forEach(record ->
						{
						//System.out.println(record.get("M") + " -> " + record.get("OP"));
						words.add(record.get("M"));
						});
					*/
					}

				return null;
				}

			@Override
			public Word apply(final String line)
				{
				throw new NotImplementedException();
				}
			};
		}
	}
