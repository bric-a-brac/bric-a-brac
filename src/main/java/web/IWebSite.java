package web;

/**
 * <h4>IWebSite</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IWebSite<T extends IWebPage>
	{
	public String getRootURL();

	public boolean isPartOf(String url);

	public void parse(IWebParser<T> parser);
	}
