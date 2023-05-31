package emoji;

public class Dev
	{
	public static void main(String[] args) throws Throwable
		{
		final var emojify = new Emojify("data/emojis.dat");

		//emojify.getEmojis().forEach(emoji -> System.out.println(emoji.getKey()));

		System.out.println(emojify.replace("dass rainbow cloud speedboat sd dasdasd face smile"));
		}
	}
