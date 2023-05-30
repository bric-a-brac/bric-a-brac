package game.card;

public class Dev
	{
	public static void formatter()
		{
		//IDeck.get().getCards();

		ICard.get().forEach(card ->
			{
			//System.out.println(Formatter.SYMBOLS.toString(card));
			});

		final var symbol = Formatter.SYMBOLS.toString(new Card(Rank.KING, Suit.SPADE));
		System.out.println(symbol);
		System.out.println("🂮".equals(symbol));
		}

	public static void main(String[] args) throws Throwable
		{
		formatter();
		}
	}
