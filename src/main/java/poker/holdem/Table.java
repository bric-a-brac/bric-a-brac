package poker.holdem;

import java.util.ArrayList;
import java.util.List;

public final class Table
	{
	private final Deck deck = new Deck();
	private final Board board = new Board();
	private final List<Player> players = new ArrayList<>();

	public List<Player> getPlayers()
		{
		return players;
		}

	public void asdsd()
		{
		players.forEach(player ->
			{
			player.getHand().getCards().add(deck.deal());
			player.getHand().getCards().add(deck.deal());
			});

		board.getFlop();
		}
	}
