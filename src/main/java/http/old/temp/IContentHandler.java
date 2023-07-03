<<<<<<< HEAD:src/main/java/wip/IContentHandler.java
package wip;
=======
package http.old.temp;
>>>>>>> client:src/main/java/http/old/temp/IContentHandler.java

import java.net.http.HttpResponse.BodyHandler;
import com.google.gson.Gson;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
public interface IContentHandler<T> extends BodyHandler<T>
	{
	public static final Gson GSON = new Gson();

	

		/*
		// BodySubscriber<InputStream> upstream = BodySubscribers.ofInputStream();

     BodySubscriber<Supplier<W>> downstream = BodySubscribers.mapping(
           upstream,
           (InputStream is) -> () -> {
               try (InputStream stream = is) {
                   ObjectMapper objectMapper = new ObjectMapper();
                   return objectMapper.readValue(stream, targetType);
               } catch (IOException e) {
                   throw new UncheckedIOException(e);
               }
           });
    return downstream;
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
