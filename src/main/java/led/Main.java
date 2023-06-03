package led;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public final class Main
	{
	/**
	 * @since 0.1.0
	 */
	private Main()
		{
		throw new UnsupportedOperationException();
		}

	/**
	 * @since 0.1.0
	 */
	public static void main(final String[] args)
		{
		try
			{
			new IcoLED().run();
			}
		catch (final Throwable ex)
			{
			ex.printStackTrace();
			}
		}
	}
