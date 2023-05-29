package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.exceptions.NullArgumentException;

public class ArgumentTest extends Assertions
	{
	@Test
	public void testNotNull()
		{
		final var argument = "argument";

		assertSame(argument, Argument.notNull(argument));

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			Argument.notNull(null);
			});
		}
	}
