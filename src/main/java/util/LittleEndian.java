package util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.commons.math3.exception.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class LittleEndian
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final ByteBuffer toByteBuffer(final byte[] bytes)
		{
		final var buffer = ByteBuffer.wrap(notNull(bytes));

		buffer.order(ByteOrder.LITTLE_ENDIAN);

		return buffer;
		}

	/**
	 * Retourne les bytes d'un fichier au format little endian.
	 * 
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public static final ByteBuffer toByteBuffer(final Path path) throws IOException
		{
		return toByteBuffer(Files.readAllBytes(notNull(path)));
		}
	}
