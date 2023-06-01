package html.old;

import org.apache.commons.lang3.NotImplementedException;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
// TODO: WallE
public class WebSite
	{
	protected final String url;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public WebSite(final String url)
		{
		super();

		this.url = notNull(url);
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public final boolean name(final String url)
		{
		notNull(url);

		throw new NotImplementedException();
		}
	}
