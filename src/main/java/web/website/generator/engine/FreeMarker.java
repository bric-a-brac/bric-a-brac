package web.website.generator.engine;

import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import freemarker.template.Configuration;

@WorkInProgress
public class FreeMarker extends AbstractTemplateEngine<Object>
	{
	@SuppressWarnings("unused")
	private FreeMarker()
		{
		throw new UnsupportedOperationException();
		}

	@Override
	@WorkInProgress
	public IRenderer<Object, String> apply(String t)
		{
		throw new NotImplementedException();
		}

	/*
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
	*/

	@WorkInProgress
	private static Configuration getConfiguration()
		{
		throw new NotImplementedException();
		}
	}
