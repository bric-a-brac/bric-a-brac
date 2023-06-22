package website.blog;

import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import website.builder.IComponent;
import website.builder.WebPage;

/**
 * <h4>Article</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class Article extends WebPage implements IArticle
	{
	@Override
	public IComponent getBody()
		{
		throw new NotImplementedException();
		}
	}
