package zim;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import annotations.Discontinued;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Discontinued
@SuppressWarnings("unused")
public class File extends java.io.File implements IFile
	{
	private static final int MASK = 0xFF;

	private final RandomAccessFile reader;

	private final int magicNumber;
	private final int majorVersion;
	private final int minorVersion;
	private final int uuid;
	private final int entryCount;
	private final int clusterCount;

	private final long urlPointerPosition;
	private final int titlePointerPosition;
	private final int clusterPointerPosition;
	private final int mimeTypesPointerPosition;

	/**
	 * @since 0.1.0
	 */
	public File(final String path) throws IOException
		{
		super(notNull(path));

		reader = new RandomAccessFile(this, "r");

		magicNumber = readBytesAsInteger(4);

		if (magicNumber != MAGIC_NUMBER)
			{
			// TODO: Error
			throw new IOException("Bad MAGIC_NUMBER");
			}

		majorVersion = readBytesAsInteger(2);
		minorVersion = readBytesAsInteger(2);
		uuid = readBytesAsInteger(16);
		entryCount = readBytesAsInteger(4);
		clusterCount = readBytesAsInteger(4);

		urlPointerPosition = readBytesAsLong(8);
		titlePointerPosition = readBytesAsInteger(8);
		clusterPointerPosition = readBytesAsInteger(8);
		mimeTypesPointerPosition = readBytesAsInteger(8);

		readBytesAsInteger(4);
		readBytesAsInteger(4);
		readBytesAsInteger(8);

		//System.out.println(mimeTypesPointerPosition);
		//System.out.println(readString());
		//System.out.println(readString());
		}

	@Override
	public final List<String> getURLs() throws IOException
		{
		reader.seek(urlPointerPosition);

		readBytesAsInteger(2);
		readBytesAsInteger(1);
		readBytesAsInteger(1);
		readBytesAsInteger(4);
		readBytesAsInteger(8);
		readBytesAsInteger(12);

		System.out.println(readString());

		/*
		mimetype 	integer 	0 	2 	MIME type number as defined in the MIME type list
		parameter len 	byte 	2 	1 	(not used) length of extra paramters
		namespace 	char 	3 	1 	defines to which namespace this directory entry belongs
		revision 	integer 	4 	4 	(optional) identifies a revision of the contents of this directory entry, needed to identify updates or revisions in the original history
		cluster number 	integer 	8 	4 	cluster number in which the data of this directory entry is stored
		blob number 	integer 	12 	4 	blob number inside the compressed cluster where the contents are stored
		url 	string 	16 	zero terminated 	string with the URL as refered in the URL pointer list
		title 	string 	n/a 	zero terminated 	string with an title as refered in the Title pointer list or empty; in case it is empty, the URL is used as title
		parameter 	data 		see parameter len 	(not used) extra parameters
		*/

		//System.out.println(readString());
		return null;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getMagicNumber()
		{
		return magicNumber;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getMajorVersion()
		{
		return majorVersion;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getMinorVersion()
		{
		return minorVersion;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getUUID()
		{
		return uuid;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getEntryCount()
		{
		return entryCount;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final int getClusterCount()
		{
		return clusterCount;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public void close() throws IOException
		{
		reader.close();
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	private final byte[] readBytes(final int count) throws IOException
		{
		final var bytes = new byte[count];

		reader.read(bytes, 0, count);
		//var b = new ByteArrayOutputStream(count);
		//var b = new ByteArrayInputStream(bytes);
		//b.
		//b.transferTo(null)
		return bytes;
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Deprecated
	private final int readBytesAsInteger(final int count) throws IOException
		{
		final var buffer = new byte[count];

		reader.read(buffer, 0, count);

		var result = 0;

		for (var i = 0; i < count; i++)
			{
			result |= (buffer[i] & MASK) << (i * 8);
			}

		return result;
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Deprecated
	private final long readBytesAsLong(final int count) throws IOException
		{
		final var bytes = readBytes(count);

		var result = 0L;

		for (var i = 0; i < count; i++)
			{
			result |= (bytes[i] & MASK) << (i * 8);
			}

		return result;
		}

	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Deprecated
	private final String readString() throws IOException
		{
		final var buffer = new StringBuffer();

		var c = reader.read();

		while (c != '\0')
			{
			buffer.append((char) c);

			c = reader.read();
			}

		return buffer.toString();
		}
	}
