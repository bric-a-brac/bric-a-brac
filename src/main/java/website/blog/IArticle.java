package website.blog;

import annotations.WorkInProgress;
import website.builder.IComponent;
import website.builder.IWebPage;

/**
 * <h4>IArticle</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public interface IArticle extends IWebPage
	{
	public IComponent getBody();
	}
