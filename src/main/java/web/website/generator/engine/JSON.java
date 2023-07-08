package web.website.generator.engine;

import com.google.gson.Gson;
import annotations.WorkInProgress;

@WorkInProgress
public final class JSON implements IEngine<IEngine.IRenderer<Object, String>>
	{
	private static final Gson GSON = new Gson();

	@Override
	public IRenderer<Object, String> get()
		{
		// Première fois que j'arrive à bien utiliser @FunctionalInterface ;-)
		return GSON::toJson;
		}
	}
