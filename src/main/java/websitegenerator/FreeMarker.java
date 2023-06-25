package websitegenerator;

import java.io.IOException;
import java.io.StringWriter;
import annotations.WorkInProgress;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import websitegenerator.engine.AbstractTemplateEngine;
import websitegenerator.engine.exceptions.RenderException;

@WorkInProgress
public final class FreeMarker extends AbstractTemplateEngine<Object>
	{
	@SuppressWarnings("unused")
	private FreeMarker()
		{
		throw new UnsupportedOperationException();
		}

	public FreeMarker(final String sdd)
		{
		super();
		}

	@Override
	public IRenderer<Object, String> apply(final String name)
		{
		return (model) ->
			{
			try
				{
				final var template = getConfiguration().getTemplate(name);

				try (final var writer = new StringWriter())
					{
					template.process(model, writer);

					return writer.toString();
					}
				}
			catch (final IOException | TemplateException ex)
				{
				throw new RenderException(ex);
				}
			};
		}

	private static Configuration getConfiguration()
		{
		return null;
		}
	}
