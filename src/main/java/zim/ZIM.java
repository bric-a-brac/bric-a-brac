package zim;

import java.io.IOException;

public class ZIM
	{
	/*
	public static void dev() throws IOException
		{
		final var file = new File("/home/thefab/Téléchargements/wikipedia_fr_all_nopic_2023-04.zim");

		final var zim = new RandomAccessFile(file, "r");

		final var buffer = new byte[4];

		zim.read(buffer, 0, 4);
		zim.read(buffer, 0, 2);

		final var x = Utilities.toTwoLittleEndianInteger(buffer);
		System.out.println(x);

		final var xx = LittleEndian.twoBytesToInteger(buffer);
		System.out.println(xx);

		//System.out.println(Arrays.toString(buffer));

		zim.close();
		}
	*/

	public static void dev() throws IOException
		{
		final var path = "wikipedia_fr_all_nopic_2023-04.zim";

		try (final var file = new File(path))
			{
			/*
			System.out.println(file.getMagicNumber());
			System.out.println(file.getMajorVersion());
			System.out.println(file.getMinorVersion());
			System.out.println(file.getUUID());
			System.out.println(file.getEntryCount());
			System.out.println(file.getClusterCount());
			*/
			file.getURLs();
			}
		}

	public static void main(String[] args) throws Throwable
		{
		dev();
		}
	}
