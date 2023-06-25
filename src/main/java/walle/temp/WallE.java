package walle.temp;

import java.io.IOException;
import annotations.WorkInProgress;

/**
 * <h4>WallE (WebAllEngine) ;-)</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public final class WallE //extends EventListenerSupport<IEventListener> //extends Client
	{
	//private static final Logger LOGGER = Logger.getLogger(WallE.class.getSimpleName());
	//private final ExecutorService executor = Executors.newSingleThreadExecutor();
	//final var future = executor.submit(() -> task.apply("https://schema.org/OrderStatus"));

	//private static final String USER_AGENT = "WallE/0.1.0";

	//private static final IClient CLIENT = new Client(USER_AGENT);

	//private final EventListenerSupport<IEventListener> eventListeners = EventListenerSupport.create(IEventListener.class);

	/*
	public void addEventListener(final IEventListener listener)
		{
		eventListeners.addListener(notNull(listener), false);
		}

	public void removeEventListener(final IEventListener listener)
		{
		eventListeners.removeListener(notNull(listener));
		}
	*/

	/**
	 * @throws NullArgumentException
	 * @throws IOException
	 * 
	 * @since 0.1.0
	 */
	public void dev(final String url) throws IOException
		{
		/*
		notNull(url);

		final var html = CLIENT.get(url);

		final var document = Parser.parse(url, html);

		final var keywords = Extractors.KEYWORDS.apply(document);

		System.out.println(keywords);

		final var links = Extractors.LINKS.apply(document);

		System.out.println(links);

		//eventListeners.fire().onDownload(new DownloadEvent(url, html));
		//return new WebPage(url, CLIENT.get(url));
		*/
		}

	/*
	public static final String getPreference(final String preference)
		{
		return Util.getPreference(WallE.class, notNull(preference));
		}
	*/
	}
