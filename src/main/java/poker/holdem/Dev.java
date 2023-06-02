package poker.holdem;

import game.card.Card;
import game.card.Deck;
import poker.Player;

public class Dev
	{
	public static void game()
		{
		final var deck = Deck.get();

		deck.shuffle();

		final var player = new Player<Hand>("Shadok", new Hand());

		player.getHand().getCards().add(deck.deal());
		player.getHand().getCards().add(deck.deal());

		player.setHand(null);

		final var board = new Board();

		board.getFlop();
		}

	public static void main(String[] args) throws Throwable
		{
		}
	}
