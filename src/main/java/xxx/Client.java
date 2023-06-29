package xxx;

import java.io.IOException;
import org.apache.commons.lang3.function.FailableFunction;
import org.apache.commons.math3.exception.NullArgumentException;
import org.jsoup.nodes.Document;
import http.SimpleClient;

import static util.Argument.notNull;

/**
 * <h4>Client</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Client extends SimpleClient
	{
	public static final String USER_AGENT = "Bric-à-Brac X Client";

	public final FailableFunction<String, Document, IOException> get = url -> getAsDocument(url);

	/**
	 * @since 0.1.0
	 */
	public Client()
		{
		// TODO: User-Agent
		super();
		}

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public final <T> T get(final String url, final FailableFunction<Document, T, IOException> mapper) throws IOException
		{
		//	get.andThen(mapper).apply(url);
		return notNull(mapper).apply(getAsDocument(url));
		}
	}
