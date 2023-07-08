package web.website.generator.engine;

import java.util.function.Function;
import annotations.WorkInProgress;

@WorkInProgress
@FunctionalInterface
public interface ITemplateEngine<T extends IEngine.IRenderer<?, String>> extends IEngine<T>, Function<String, T>
	{
	@Override
	public default T get()
		{
		throw new UnsupportedOperationException();
		}

	public default T getRenderer(final String template)
		{
		return apply(template);
		}
	}
