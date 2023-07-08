package web.website.generator.engine;

import java.util.function.Function;
import java.util.function.Supplier;
import annotations.WorkInProgress;

@WorkInProgress
@FunctionalInterface
public interface IEngine<T extends IEngine.IRenderer<?, ?>> extends Supplier<T>
	{
	@WorkInProgress
	@FunctionalInterface
	public interface IRenderer<T, R> extends Function<T, R>
		{
		public default R render(final T model)
			{
			return apply(model);
			}
		}

	public default T getRenderer()
		{
		return get();
		}
	}
