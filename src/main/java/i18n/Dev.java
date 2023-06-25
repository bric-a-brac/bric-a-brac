package i18n;

import java.util.Locale;

public class Dev
	{
	public static void main(String[] args)
		{
		final var messages = I18N.get("messages", Locale.ENGLISH);
		//final var messages = I18N.get("messages");

		System.out.println(messages.getMessage("message.text"));

		final var i18n = I18N.get("i18n/websitebuilder");
		System.out.println(i18n.getMessage("next"));
		}
	}
