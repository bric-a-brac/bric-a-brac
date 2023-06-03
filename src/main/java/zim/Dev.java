package zim;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Dev
	{
	public static void littleEndian()
		{
		final byte[] bytes = {(byte) 0x01, (byte) 0x00};

		//final short x = (short) ((bytes[1] << 8) | (bytes[0] & 0xFF) << 0);
		//final short x = (short) ((bytes[0] << 0) | (bytes[1] & 0xFF) << 8);
		final int x = ((bytes[0] << 0) | (bytes[1] & 0xFF) << 8);

		//final short y = (short) (0);

		System.out.println(x);
		}

	public static void j()
		{
		final var buffer = ByteBuffer.allocate(2);

		//buffer.order(ByteOrder.BIG_ENDIAN);

		final byte[] bytes = {(byte) 0x01, (byte) 0x00};

		buffer.put(0, bytes);

		buffer.rewind();
		for (var i = 0; i < 2; i++)
			{
			System.out.println(buffer.get(i));
			}

		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.rewind();
		for (var i = 0; i < 2; i++)
			{
			System.out.println(buffer.get(i));
			}

		//Integer.reverse(0)
		//final var ssd = Integer.valueOf(4);
		//System.out.println(ssd);
		//ssd.reverse(0)
		}

	public static void i()
		{
		final var i = 23;

		System.out.println(i);

		final var r = Integer.reverseBytes(i);

		System.out.println(r);
		}

	public static void zimMagicNumber(final RandomAccessFile reader) throws IOException
		{
		final var bytes = new byte[4];

		reader.read(bytes);

		final var buffer = ByteBuffer.allocate(4);

		buffer.put(bytes);

		//System.out.println(buffer);
		buffer.rewind();
		final var big = buffer.getInt();
		System.out.println(big);

		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.rewind();
		final var little = buffer.getInt();
		System.out.println(little);
		}

	public static void zimUUID(final RandomAccessFile reader) throws IOException
		{
		reader.seek(8);

		final var bytes = new byte[16];

		reader.read(bytes);

		final var buffer = ByteBuffer.allocate(16);

		buffer.put(bytes);

		buffer.order(ByteOrder.LITTLE_ENDIAN);
		buffer.rewind();
		//final var little = buffer.getLong();
		//buffer.getLong();
		final var characters = buffer.asCharBuffer();
		System.out.println(characters.toString());
		}

	public static void zimVersion(final RandomAccessFile reader) throws IOException
		{
		reader.seek(4);

		final var version = read(reader, 2).getShort();

		System.out.println(version);
		}

	public static ByteBuffer read(final RandomAccessFile reader, final int count) throws IOException
		{
		// TODO: count > 0

		final var bytes = new byte[count];

		// TODO: Check read
		reader.read(bytes);

		final var buffer = ByteBuffer.allocate(count);

		buffer.put(bytes);

		buffer.order(ByteOrder.LITTLE_ENDIAN);

		buffer.rewind();

		return buffer;
		}

	public static short readShort(final RandomAccessFile reader) throws IOException
		{
		return read(reader, 2).getShort();
		}

	public static int readInteger(final RandomAccessFile reader) throws IOException
		{
		return read(reader, 4).getInt();
		}

	public static long readLong(final RandomAccessFile reader) throws IOException
		{
		return read(reader, 8).getLong();
		}

	public static void zim() throws IOException
		{
		final var path = "wikipedia_fr_all_nopic_2023-04.zim";

		final var reader = new RandomAccessFile(path, "r");

		//zimMagicNumber(reader);
		//zimUUID(reader);
		//log("OK");
		//zimVersion(reader);
		System.out.println(readInteger(reader));
		System.out.println(readShort(reader));
		System.out.println(readShort(reader));

		reader.close();
		}

	public static void main(String[] args) throws Exception
		{
		//littleEndian();
		//j();
		//i();
		//zimMagicNumber();
		zim();
		}
	}
