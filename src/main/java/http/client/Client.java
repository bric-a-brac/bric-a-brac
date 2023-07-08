package http.client;

import java.net.http.HttpClient;
import util.exceptions.NullArgumentException;

/**
 * <h4>Client HTTP</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Client extends AbstractClient
	{
	protected final String userAgent;

	/**
	 * @since 0.1.0
	 */
	public Client()
		{
		super();

		userAgent = null;
		}

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Client(final HttpClient client)
		{
		super(client);

		userAgent = null;
		}

	/**
	 * @since 0.1.0
	 */
	@Override
	public final String getUserAgent()
		{
		return userAgent;
		}
	}
