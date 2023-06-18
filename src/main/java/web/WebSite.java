package web;

import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public class WebSite<T extends IWebPage> implements IWebSite<T>
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
	 * @since 0.1.0
	 */
	@Override
	public final String getRootURL()
		{
		return url;
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	@WorkInProgress
	public final boolean isPartOf(final String url)
		{
		notNull(url);

		throw new NotImplementedException();
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	@Override
	@WorkInProgress
	public final void parse(final IWebParser<T> parser)
		{
		notNull(parser);

		throw new NotImplementedException();
		}
	}
