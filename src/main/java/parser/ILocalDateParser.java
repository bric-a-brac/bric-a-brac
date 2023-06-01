package parser;

import java.time.LocalDate;

@FunctionalInterface
public interface ILocalDateParser extends IStringParser<LocalDate, IllegalArgumentException>
	{
	}
