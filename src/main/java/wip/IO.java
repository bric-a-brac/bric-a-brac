package wip;

import java.nio.file.Path;
import java.util.function.Predicate;
import annotations.WorkInProgress;
import util.Constant;

import static util.Argument.notNull;

@WorkInProgress
public class IO
	{
	// TODO: Dans Util IO.... et trouver nom ;)
	@WorkInProgress
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
		}
	}
