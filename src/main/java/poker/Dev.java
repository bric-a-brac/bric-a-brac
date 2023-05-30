package poker;

import game.card.ICard;

public class Dev
	{
	public static void main(String[] args) throws Throwable
		{
		new Player<IHand<ICard>>().getHand().getCards();

		new Player<IHand<?>>().getHand().getCards();

		//new Player<IHand<String>>().getHand().getCards();
		}
	}
