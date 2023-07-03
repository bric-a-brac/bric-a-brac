package led;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.apache.commons.lang3.function.FailableRunnable;
import com.google.gson.Gson;
import image.Icon16;
import util.Util;

//import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@SuppressWarnings("unused")
public final class IcoLED implements FailableRunnable<IOException>
	{
	private static final String USER_AGENT = "IcoLED";
	private static final String ICONS_DIRECTORY_PREFERENCE = "icons-directory";

	private static final Gson GSON = new Gson();

	/**
	 * @since 0.1.0
	 */
	public IcoLED()
		{
		//super(USER_AGENT);
		super();
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public void run() throws IOException
		{
		/*
		final var directory = Util.DIRECTORY_FROM_PREFERENCE.apply(getClass(), ICONS_DIRECTORY_PREFERENCE);

		final var icons = new ArrayList<int[][]>();

		try (final var paths = Files.newDirectoryStream(directory))
			{
			for (final var path : paths)
				{
				icons.add(pixelize(path));
				}
			}

		final var json = GSON.toJson(icons);
		//System.out.println(json);

		final var request = Request.post("http://localhost:3000/icons").bodyString(json, ContentType.APPLICATION_JSON);
		//json(null, userAgent);

		final var response = execute(request, IContentHandler.TEXT);

		System.out.println(response);
		*/
		}

	/**
	 * @since 0.1.0
	 */
	/*
	private int[][] pixelize(final Path path) throws IOException
		{
		final var icon = new Icon16(path.toString());

		final var pixels = new int[16 * 16][5];

		// Pas besoin positions
		icon.getPixels().stream().map(pixel -> pixel.getColor());

		// FIXME: sdsd
		// TODO: Adapters
		icon.getPixels().forEach(pixel ->
			{
			final var position = pixel.getPosition();
			final var color = pixel.getColor();

			final var x = (int) position.getX();
			final var y = (int) position.getY();

			final var red = color.getRed();
			final var green = color.getGreen();
			final var blue = color.getBlue();

			pixels[y * 16 + x] = new int[] {x, y, red, green, blue};
			});

		//return GSON.toJson(pixels);
		return pixels;
		}
	*/
	}
