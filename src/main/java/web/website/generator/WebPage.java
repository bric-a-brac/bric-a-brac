package web.website.generator;

import annotations.WorkInProgress;
import web.website.generator.components.Component;

/**
 * <h4>WebPage</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class WebPage extends Component implements IWebPage
	{
	/**
	 * @since 0.1.0
	 */
	@Override
	public String layout()
		{
		return "<html></html>";
		}
	}
