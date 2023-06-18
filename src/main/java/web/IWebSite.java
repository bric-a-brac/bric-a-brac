package web;

/**
 * <h4>IWebSite</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IWebSite<T extends IWebPage>
	{
	/**
	 * @since 0.1.0
	 */
	public String getRootURL();

	/**
	 * @since 0.1.0
	 */
	public boolean isPartOf(String url);

	/**
	 * @since 0.1.0
	 */
	public void parse(IWebParser<T> parser);
	}
