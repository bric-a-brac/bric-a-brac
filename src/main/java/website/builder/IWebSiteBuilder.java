package website.builder;

import java.io.IOException;
import org.apache.commons.lang3.function.FailableConsumer;
import annotations.WorkInProgress;

/**
 * <h4>IWebSiteBuilder</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IWebSiteBuilder extends FailableConsumer<IConfiguration, IOException>
	{
	/**
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public default void build(final IConfiguration configuration) throws IOException
		{
		accept(configuration);
		}
	}
