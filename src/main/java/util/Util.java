package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.function.ToIntFunction;
import java.util.prefs.Preferences;
import org.apache.commons.lang3.function.FailableBiFunction;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.lang3.function.FailablePredicate;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class Util
	{
	/**
	 * @since 0.1.0
	 */
	public static final FailableBiFunction<Class<?>, String, Path, IOException> DIRECTORY_FROM_PREFERENCE = (clazz, key) -> IO.DIRECTORY_FROM_STRING.apply(getPreference(clazz, key));

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final String getPreference(final Class<?> clazz, final String key)
		{
		notNull(clazz);
		notNull(key);

		return Preferences.userNodeForPackage(clazz).get(key, null);
		}

	/*
	public static final <T> T getPreference(final Class<?> clazz, final String key, final FailableFunction<String, T, IOException> mapper)
		{
		notNull(mapper);

		return mapper.apply(getPreference(clazz, key));
		}
	*/

	/**
	 * @since 0.1.0
	 */
	public static final <T> Comparator<T> intGetterComparator(final ToIntFunction<T> getter)
		{
		return (left, right) ->
			{
			if (left == null)
				{
				if (right == null)
					{
					return 0;
					}

				return 1;
				}

			if (right == null)
				{
				return -1;
				}

			return Integer.compare(getter.applyAsInt(left), getter.applyAsInt(right));
			};
		}
	}

final class IO
	{
	/**
	 * @since 0.1.0
	 */
	@Deprecated
	public static final FailablePredicate<Path, IOException> EXISTS = IO::exists;

	/**
	 * @since 0.1.0
	 */
	@Deprecated
	public static final FailablePredicate<Path, IOException> DIRECTORY = IO::directory;

	/**
	 * @since 0.1.0
	 */
	public static final FailablePredicate<Path, IOException> DIRECTORY_EXISTS = EXISTS.and(DIRECTORY);

	/**
	 * @since 0.1.0
	 */
	public static final FailableFunction<String, Path, IOException> DIRECTORY_FROM_STRING = value ->
		{
		final var path = Paths.get(notNull(value));

		DIRECTORY_EXISTS.test(path);

		return path;
		};

	/**
	 * @throws NullArgumentException
	 * @throws FileNotFoundException
	 * 
	 * @since 0.1.0
	 */
	public static final boolean exists(final Path path) throws FileNotFoundException
		{
		notNull(path);

		if (!Files.exists(path))
			{
			throw new FileNotFoundException(path.toString());
			}

		return true;
		}

	/**
	 * @throws NullArgumentException
	 * @throws NotDirectoryException
	 * 
	 * @since 0.1.0
	 */
	public static final boolean directory(final Path path) throws NotDirectoryException
		{
		notNull(path);

		if (!Files.isDirectory(path))
			{
			throw new NotDirectoryException(path.toString());
			}

		return true;
		}

	public static void name() {
		//Files.w
	}
	}
