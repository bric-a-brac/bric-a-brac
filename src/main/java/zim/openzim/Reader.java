package zim.openzim;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import static util.Argument.notNull;

public class Reader extends RandomAccessFile implements IReader
	{
	/**
	 * @param file ZimFile pas java.io.File !!
	 * 
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public Reader(final File file) throws IOException
		{
		super(notNull(file), "r");

		final var m = readLittleEndianInteger();
		final var v = readLittleEndianShort();
		final var vv = readLittleEndianShort();
		System.out.println(m);
		System.out.println(v);
		System.out.println(vv);
		}

	/**
	 * AutoCloseable ;)
	 * 
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final void close() throws IOException
		{
		super.close();
		}

	private final ByteBuffer readLittleEndianBytes(final int count) throws IOException
		{
		// TODO: count > 0

		final var bytes = new byte[count];

		// TODO: Check read
		read(bytes);

		final var buffer = ByteBuffer.allocate(count);
		buffer.put(bytes);
		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.rewind();
		return buffer;
		}

	private final short readLittleEndianShort() throws IOException
		{
		return readLittleEndianBytes(2).getShort();
		}

	private final int readLittleEndianInteger() throws IOException
		{
		return readLittleEndianBytes(4).getInt();
		}

	/*
	public static long readLong(final RandomAccessFile reader) throws IOException
		{
		return read(reader, 8).getLong();
		}
	*/
	}
