package api;

public class Dev
	{
	public static class BUJO extends AbstractAPI
		{
		public IEndPoint<String> getAgenda()
			{
			return getEndPoint(String.class);
			}
		}

	public static void main(String[] args) throws Throwable
		{
		final var bujo = new BUJO();

		final var all = bujo.getAgenda().getAll();

		all.forEach(entry ->
			{
			System.out.println(entry);
			});
		}
	}
