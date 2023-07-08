package websitegenerator;

import org.apache.commons.lang3.event.EventListenerSupport;
import annotations.WorkInProgress;
import web.website.generator.IWebSiteGenerator;
import websitegenerator.event.IEventListener;

/**
 * <h4>WebSiteGenerator</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@Deprecated
@WorkInProgress
public class WebSiteGenerator implements IWebSiteGenerator
	{
	private final EventListenerSupport<IEventListener> eventListeners = EventListenerSupport.create(IEventListener.class);

	// Bravo, t'aurais pas réussi à faire plus long :-(
	//private final ITemplateEngine<IEngine.IRenderer<Object, String, ? extends EngineException>> engine;
	// Mieux ;-)
	//private final ITemplateEngine<IEngine.IRenderer<Object, String>> engine;

	/*
	public WebSiteGenerator()
		{
		super();

		engine = new FreeMarker("sdds");
		}
	*/

	}
