package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import static util.Argument.notNull;

/**
 * <h4>I18N</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public final class I18N
	{
	private final ResourceBundle bundle;

	private I18N(final ResourceBundle bundle)
		{
		super();

		this.bundle = bundle;
		}

	public String getMessage(final String message)
		{
		notNull(message);

		return bundle.getString(message);
		}

	public static I18N get(final String messages)
		{
		return get(messages, Locale.getDefault());
		}

	public static I18N get(final String messages, final Locale locale)
		{
		notNull(messages);
		notNull(locale);

		return new I18N(ResourceBundle.getBundle(messages, locale));
		}
	}
