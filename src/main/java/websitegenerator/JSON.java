package websitegenerator;

import com.google.gson.Gson;
import annotations.WorkInProgress;
import websitegenerator.engine.IEngine;

@WorkInProgress
public final class JSON implements IEngine<IEngine.IRenderer<Object, String>>
	{
	private static final Gson GSON = new Gson();

	@Override
	public IRenderer<Object, String> get()
		{
		/*
		return (object) ->
			{
			GSON.toJson(object);
			};
		*/

		// Première fois que j'arrive à bien utiliser @FunctionalInterface ;-)
		return GSON::toJson;
		}
	}
