package util;

import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
