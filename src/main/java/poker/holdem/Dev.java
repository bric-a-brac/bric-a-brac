package poker.holdem;

public class Dev
	{
	public static void table()
		{
		final var table = new Table();

		table.getPlayers().add(new Player("Shadok"));
		table.getPlayers().add(new Player("Vilain #1"));
		table.getPlayers().add(new Player("Vilain #2"));
		table.getPlayers().add(new Player("Vilain #3"));
		}

	public static void main(String[] args) throws Throwable
		{
		table();
		}
	}
