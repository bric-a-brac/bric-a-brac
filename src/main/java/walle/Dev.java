package walle;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import util.Constant;
import walle.temp.WallE;

import static util.Argument.notNull;

public class Dev
	{
	// TODO: Dans Util IO.... et trouver nom ;)
	public static final Predicate<Path> START_WITH_DOT = path ->
		{
		notNull(path);

		for (final var part : path)
			{
			if (part.toString().startsWith(Constant.DOT))
				{
				return true;
				}
			}

		return false;
		};

	public static void main(String[] args)
		{
		new Client().d();

		//final var path = Paths.get(".sddd");
		//final var ok = START_WITH_DOT.test(path);
		//System.out.println(ok);
		}
	}
