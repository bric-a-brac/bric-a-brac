package web;

import java.util.List;
import org.jsoup.nodes.Document;

/**
 * <h4>IWebPage</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IWebPage
	{
	/**
	 * @since 0.1.0
	 */
	public Document getDocument();

	/**
	 * @since 0.1.0
	 */
	public String getHTML();

	/**
	 * @since 0.1.0
	 */
	public List<String> getLinks();

	/**
	 * @since 0.1.0
	 */
	public String getURL();

	/**
	 * @since 0.1.0
	 */
	public List<String> getWords();
	}
