package game.card;

public class Dev
	{
	public static void formatter()
		{
		IDeck.get().getCards();

		ICard.get().forEach(card ->
			{
			System.out.println(Formatter.CARDS.toString(card));
			});

		/*
		final var t = Formatter.CARDS.toString(new Card(Rank.KING, Suit.SPADE));
		System.out.println(t);
		System.out.println("🂮".equals(t));
		*/
		}

	public static void main(String[] args) throws Throwable
		{
		formatter();
		}
	}
