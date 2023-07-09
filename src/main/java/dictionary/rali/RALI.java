package dictionary.rali;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import annotations.WorkInProgress;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class RALI
	{
	private RALI()
		{
		// http://rali.iro.umontreal.ca/rali/?q=fr

		// Le laboratoire RALI (Recherche appliquée en linguistique informatique) est un groupe de recherche
		// à l’Université de Montréal qui réunit des informaticiens et des linguistes se spécialisant dans
		// le traitement automatique du langage naturel (TALN). Cette branche de l’intelligence artificielle
		// s’intéresse à l’application des principes scientifiques et des techniques de l’informatique
		// à tous les aspects des langages humains.

		throw new UnsupportedOperationException();
		}

	@WorkInProgress
	public static final Dictionary load(final Path path) throws IOException
		{
		return new Dictionary(Loader.load(path));
		}

	@WorkInProgress
	public static class Reader
		{
		@WorkInProgress
		public static void read(final Path path, final Consumer<CSVRecord> consumer) throws IOException
			{
			notNull(path);
			notNull(consumer);

			// M	no	réflexif	exclamatif	interrogatif	h-aspiré	CONT	DOM 	OP	SENS	OP1	CA

			final var format = CSVFormat.Builder.create()
				.setDelimiter('\t')
				.setSkipHeaderRecord(true)
				.setHeader("M", "no", "r\u00E9flexif", "exclamatif", "interrogatif", "h-aspir\u00E9", "CONT", "DOM", "OP", "SENS", "OP1", "CA")
				.build();

			CSVParser.parse(path, StandardCharsets.UTF_8, format).forEach(consumer);

			/*
			CSVParser.parse(path, StandardCharsets.UTF_8, format).forEach(record ->
				{
				//System.out.println(record.get("M") + " -> " + record.get("OP1"));
				consumer.accept(record);
				});
			*/
			}
		}

	@WorkInProgress
	public static class Loader
		{
		@WorkInProgress
		public static Map<String, Word> load(final Path path) throws IOException
			{
			final var words = new HashMap<String, Word>();

			Reader.read(path, record ->
				{
				words.put(record.get("M"), new Word());
				});

			return words;
			}
		}

	public static void main(String[] args) throws Exception
		{
		final var dictionary = load(Paths.get("../Dictionnaires/RALI/DEM-1_1.csv"));

		System.out.println(dictionary.getWords().size());

		dictionary.getWord("porte").ifPresent(word ->
			{
			System.out.println(word);
			});
		}
	}
