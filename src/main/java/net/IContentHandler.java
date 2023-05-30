package net;

import java.awt.image.BufferedImage;
import java.net.http.HttpResponse.BodyHandler;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IContentHandler<T> extends BodyHandler<T>
	{
	public static final IContentHandler<BufferedImage> IMAGE = new ImageHandler();

	//public static final Gson GSON = new Gson();

	//public static IContentHandler<byte[]> BINARY = content -> content.asBytes();

	//public static IContentHandler<String> TEXT = content -> content.asString();

	//public static IContentHandler<InputStream> STREAM = content -> content.asStream();

	/*
	public static IContentHandler<Document> HTML = content ->
		{
		//Jsoup.parse(content.asString());
		};
	*/

	/*
	public static <T> FailableFunction<Content, T, IOException> JSON(final Class<T> classOfT)
		{
		notNull(classOfT);

		return content ->
			{
			try
				{
				return GSON.fromJson(content.asString(), classOfT);
				}
			catch (final JsonSyntaxException ex)
				{
				throw new IOException(ex);
				}
			};
		}
	*/

	/*
	public static FailableFunction<Content, BufferedImage, IOException> IMAGE = content ->
		{
		try (final var stream = content.asStream())
			{
			return Image.read(stream);
			}
		};
	*/

	/*
	public static IContentHandler<Path> SAVE(final Path path)
		{
		notNull(path);

		return content ->
			{
			IO.write(content.asStream(), path.toFile());

			return path;
			};
		}
	*/

	/*
	public static IContentHandler<Path> TEMP_FILE = content ->
		{
		final var path = TemporaryDirectory.createTemporaryFile();

		IO.write(content.asStream(), path.toFile());

		return path;
		};
	*/
	}
