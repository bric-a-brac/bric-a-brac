package website.builder;

import java.io.IOException;
import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;

/**
 * <h4>IWebSiteBuilder</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IWebSiteBuilder extends FailableFunction<IConfiguration, IWebSite, IOException>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public default IWebSite build(final IConfiguration configuration) throws IOException
		{
		return apply(configuration);
		}
	}
