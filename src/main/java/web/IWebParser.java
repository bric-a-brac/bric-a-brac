package web;

import annotations.WorkInProgress;

/**
 * <h4>IWebParser</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public interface IWebParser<T extends IWebPage>
	{
	public void onWebPage(T webpage);
	}
