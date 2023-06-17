package poker.dev;

import java.io.IOException;
import java.nio.file.Path;
import org.apache.commons.math3.exception.NullArgumentException;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class SpeedTest extends Evaluator
	{
	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public SpeedTest(final Path path) throws IOException
		{
		super(path);
		}

	/**
	 * @since 0.1.0
	 */
	public final void test()
		{
		int u0, u1, u2, u3, u4, u5;
		int c0, c1, c2, c3, c4, c5, c6;
		int[] handTypeSum = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int count = 0;

		final var start = System.currentTimeMillis();

		for (c0 = 1; c0 < 47; c0++)
			{
			u0 = getNewPosition(53 + c0);

			for (c1 = c0 + 1; c1 < 48; c1++)
				{
				u1 = getNewPosition(u0 + c1);

				for (c2 = c1 + 1; c2 < 49; c2++)
					{
					u2 = getNewPosition(u1 + c2);

					for (c3 = c2 + 1; c3 < 50; c3++)
						{
						u3 = getNewPosition(u2 + c3);

						for (c4 = c3 + 1; c4 < 51; c4++)
							{
							u4 = getNewPosition(u3 + c4);

							for (c5 = c4 + 1; c5 < 52; c5++)
								{
								u5 = getNewPosition(u4 + c5);

								for (c6 = c5 + 1; c6 < 53; c6++)
									{
									handTypeSum[getNewPosition(u5 + c6) >> 12]++;

									count++;
									}
								}
							}
						}
					}
				}
			}

		final var end = System.currentTimeMillis();

		var tests = 0;

		for (var type: Type.values())
			{
			tests += handTypeSum[type.ordinal()];

			//System.out.println(String.format("%s: %d", type, handTypeSum[type.ordinal()]));
			}

		assert(count == 133784560);
		assert(tests == count);
		// Pas de combinaisons invalides
		assert(handTypeSum[0] == 0);

		test(count, end - start);
		}

	/**
	 * @since 0.1.0
	 */
	public void test(final int count, final long milliseconds)
		{
		System.out.println("Enumerated " + count + " hands in " + milliseconds + " milliseconds");
		}
	}
