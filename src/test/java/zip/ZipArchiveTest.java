package zip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.exceptions.NullArgumentException;

public class ZipArchiveTest extends Assertions
	{
	@Test
	public void testArchive() throws IOException
		{
		assertThrowsExactly(NullArgumentException.class, () ->
			{
			try (final var zip = new ZipArchive((File) null))
				{
				}
			});

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			try (final var zip = new ZipArchive((Path) null))
				{
				}
			});

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			try (final var zip = new ZipArchive((String) null))
				{
				}
			});

		try (final var zip = new ZipArchive(new File("tests/zip/archive.zip")))
			{
			assertNotNull(zip);
			}

		try (final var zip = new ZipArchive(Paths.get("tests/zip/archive.zip")))
			{
			assertNotNull(zip);
			}

		try (final var zip = new ZipArchive("tests/zip/archive.zip"))
			{
			assertNotNull(zip);
			}
		}

	@Test
	public void testNotArchive()
		{
		assertThrowsExactly(ZipException.class, () ->
			{
			try (final var zip = new ZipArchive("tests/zip/not-archive.zip"))
				{
				}
			});
		}

	@Test
	public void testRead() throws IOException
		{
		try (final var zip = new ZipArchive("tests/zip/archive.zip"))
			{
			final var content = zip.read(Paths.get("test.txt"));

			assertNotNull(content);

			final var expected = Files.readString(Paths.get("tests/zip/test.txt"));

			assertNotNull(expected);

			assertEquals(expected, content);
			}
		}
	}
