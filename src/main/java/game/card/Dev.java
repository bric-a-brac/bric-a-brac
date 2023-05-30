package game.card;

public class Dev
	{
	public static void main(String[] args) throws Throwable
		{
		final var symbol = Formatter.SYMBOLS.format(new Card(Rank.KING, Suit.SPADE));

		System.out.println(symbol);
		System.out.println("🂮");
		System.out.println("🂮".equals(symbol));
		}
	}
