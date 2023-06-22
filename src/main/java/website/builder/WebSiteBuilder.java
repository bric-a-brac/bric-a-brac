package website.builder;

import java.io.IOException;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

/**
 * <h4>WebSiteBuilder</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class WebSiteBuilder implements IWebSiteBuilder
	{
	@Override
	public void accept(final IConfiguration configuration) throws IOException
		{
		throw new NotImplementedException();
		}

	public static void main(String[] args) throws Throwable
		{
		// TODO: Config depuis fichier
		final var configuration = new IConfiguration()
			{
			};

		final var builder = new WebSiteBuilder();

		builder.build(configuration);
		}
	}
