package combination;

import java.util.function.Predicate;

public class NK implements Predicate<int[]>
	{
	protected final int n;
	protected final int k;

	private int[] indexes;

	public NK(final int n, final int k)
		{
		super();
		this.n = n;
		this.k = k;
		}

	@Override
	public boolean test(int[] t)
		{
		return false;
		}
	}
