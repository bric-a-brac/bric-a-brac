package combination;

import java.util.Iterator;
import java.util.function.Predicate;
import org.apache.commons.lang3.NotImplementedException;

/**
 * <h4>AbstractCombinationNK</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public abstract class AbstractCombinationNK implements ICombinationNK<int[]>
	{
	public AbstractCombinationNK(final int n, final int k)
		{
		super();
		}

	@Override
	public final Iterator<int[]> iterator()
		{
		return new CombinationIterator();
		}

	private final class CombinationIterator implements Predicate<int[]>, Iterator<int[]>
		{
		@Override
		public boolean test(int[] t)
			{
			throw new NotImplementedException();
			}

		@Override
		public boolean hasNext()
			{
			throw new NotImplementedException();
			}

		@Override
		public int[] next()
			{
			throw new NotImplementedException();
			}
		}
	}
