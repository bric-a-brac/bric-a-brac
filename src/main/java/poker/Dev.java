package poker;

import java.io.IOException;
import java.nio.file.Paths;
import poker.evaluator.SpeedTest;
import poker.holdem.Player;
import poker.holdem.Table;
import poker.holdem.statistics.Statistics;

public class Dev
	{
	public static void sddd() throws IOException
		{
		final var evaluator = new SpeedTest(Paths.get("data", "HandRanks.dat"));

		evaluator.test();
		}

	public static void main(String[] args) throws Throwable
		{
		//new Player<IHand<ICard>>().getHand().getCards();
		//new Player<IHand<?>>().getHand().getCards();
		//new Player<IHand<String>>().getHand().getCards();
		}
	}

class HoldEm
	{
	public static void table()
		{
		final var table = new Table();

		table.getPlayers().add(new Player("Shadok"));
		table.getPlayers().add(new Player("Vilain #1"));
		table.getPlayers().add(new Player("Vilain #2"));
		table.getPlayers().add(new Player("Vilain #3"));
		}
	}

//System.out.println("Nombre de combinaisons de 5 cartes: " + n);
//                                     2598960
// Nombre de combinaisons de 5 cartes: 2598960

class HoldEmStatistics
	{
	public static void asdsa() throws IOException
		{
		final var statistics = new Statistics();

		statistics.build();

		//statistics.evaluate(null);
		}
	}

class HoldEmTraining
	{
	}
