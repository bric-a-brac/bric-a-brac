package websitegenerator;

import org.apache.commons.lang3.event.EventListenerSupport;
import annotations.WorkInProgress;
import websitegenerator.engine.IEngine;
import websitegenerator.engine.ITemplateEngine;
import websitegenerator.engine.exceptions.EngineException;
import websitegenerator.event.GetEvent;
import websitegenerator.event.IEventListener;

/**
 * <h4>WebSiteGenerator</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class WebSiteGenerator implements IWebSiteGenerator
	{
	private final EventListenerSupport<IEventListener> eventListeners = EventListenerSupport.create(IEventListener.class);

	// Bravo, t'aurais pas réussi à faire plus long :-(
	//private final ITemplateEngine<IEngine.IRenderer<Object, String, ? extends EngineException>> engine;
	// Mieux ;-)
	private final ITemplateEngine<IEngine.IRenderer<Object, String>> engine;

	/*
	public WebSiteGenerator()
		{
		super();

		engine = new FreeMarker("sdds");
		}
	*/

	public WebSiteGenerator(final ITemplateEngine<IEngine.IRenderer<Object, String>> engine)
		{
		super();

		this.engine = engine;

		//EventUtils.addEventListener(engine, null, null);
		}

	public void dev() throws EngineException
		{
		eventListeners.fire().onGet(new GetEvent(this));

		engine.getRenderer("ssds").render(this);
		}

	/*
	public static final Class<? extends ITemplateEngine<?>> create(final String name) throws Throwable
		{
		final var clazz = Class.forName(name);

		ITemplateEngine.class.getTypeParameters();

		if (clazz.isAssignableFrom(ITemplateEngine.class))
			{
			clazz.asSubclass(ITemplateEngine.class);
			}

		return null;
		}
	*/

	/*
	public static final void dev() throws Throwable
		{
		

		
		final var ctor = clazz.getConstructor(Path.class);

		final var path = Paths.get("templatesDirectory");

		final var engine = ctor.newInstance(path);

		// instanceof ITemplateEngine
		clazz.cast(engine);
		}
	*/
	}
