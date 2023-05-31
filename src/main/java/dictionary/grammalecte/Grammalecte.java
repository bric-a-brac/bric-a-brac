package dictionary.grammalecte;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.stream.Stream;
import io.IO;
import util.Constant;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Grammalecte
	{
	private Grammalecte()
		{
		// https://grammalecte.net/

		throw new UnsupportedOperationException();
		}

	private static Stream<String> lines(final String path) throws IOException
		{
		// Y'a des doublons !!!!!!!!!!! ex. zinzin... OK avec distinct() ;-) mais c'est peut-être que dans dico réforme ??
		return Files.lines(IO.toPath(path), StandardCharsets.UTF_8).distinct();
		}

	private static Word word(final String line)
		{
		final var tokens = line.split(Constant.SLASH);

		if (tokens.length == 1)
			{
			return new Word(tokens[0]);
			}

		return new Word(tokens[0], tokens[1]);
		}

	private static void words() throws IOException
		{
		final var path = "/home/thefab/Téléchargements/Dico/dictionaries/fr-classique.dic";

		final var charabias = new HashSet<String>();

		lines(path).map(Grammalecte::word).forEach(word ->
			{
			//System.out.println(word + " --> " + word.getCharabia());
			charabias.add(word.getCharabia());
			});

		charabias.forEach(charabia ->
			{
			System.out.println(charabia);
			});
		}

	public static void main(String[] args) throws Throwable
		{
		words();
		}
	}
