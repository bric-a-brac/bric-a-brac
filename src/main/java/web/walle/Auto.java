package web.walle;

import java.sql.SQLException;
import annotations.WorkInProgress;

/**
 * <h4>Auto</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class Auto
	{
	public static void main(String[] args)
		{
		try (final var axiom = new Axiom())
			{
			new WallE(axiom).process("https://www.ritzy.ch/");
			}
		catch (final SQLException ex)
			{
			ex.printStackTrace();
			}
		}
	}
