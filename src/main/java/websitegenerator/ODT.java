package websitegenerator;

import annotations.WorkInProgress;
import opendocument.IOpenDocument;
import websitegenerator.engine.AbstractTemplateEngine;

@WorkInProgress
public class ODT extends AbstractTemplateEngine<IOpenDocument>
	{
	@Override
	public IRenderer<IOpenDocument, String> apply(final String template)
		{
		return (document) ->
			{
			return "";
			};
		}
	}
