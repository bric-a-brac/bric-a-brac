package poker.evaluator;

import java.nio.file.Paths;
import poker.dev.SpeedTest;

public class Dev
	{
	public static void main(String[] args) throws Exception
		{
		final var evaluator = new SpeedTest(Paths.get("data", "HandRanks.dat"));

		evaluator.test();

		//evaluator.evaluate(null)
		}
	}
