package websitegenerator.engine;

import java.util.function.Supplier;
import org.apache.commons.lang3.function.FailableFunction;
import annotations.WorkInProgress;
import websitegenerator.engine.exceptions.EngineException;

@WorkInProgress
@FunctionalInterface
public interface IEngine<T extends IEngine.IRenderer<?, ?>> extends Supplier<T>
	{
	@WorkInProgress
	@FunctionalInterface
	public interface IRenderer<T, R> extends FailableFunction<T, R, EngineException>
		{
		public default R render(final T model) throws EngineException
			{
			return apply(model);
			}
		}

	public default T getRenderer()
		{
		return get();
		}
	}
