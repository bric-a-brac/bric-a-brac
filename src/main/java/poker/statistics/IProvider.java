package poker.statistics;

import java.util.function.IntFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import annotations.WorkInProgress;

import static util.Argument.strictlyPositive;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
@FunctionalInterface
public interface IProvider extends IntFunction<IWalker>
	{
	/**
	 * @throws NotStrictlyPositiveException
	 * 
	 * @since 0.1.0
	 */
	public default IWalker walker(final int count)
		{
		strictlyPositive(count);

		return apply(count);
		}
	}
