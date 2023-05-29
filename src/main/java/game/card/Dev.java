package game.card;

public class Dev
	{
	public static void format()
		{
		System.out.println(Formatter.CARDS.format(new Card(Rank.KING, Suit.SPADE)));
		}

	public static void main(String[] args) throws Throwable
		{
		format();
		}
	}
