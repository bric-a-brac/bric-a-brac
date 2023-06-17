package poker.dev;

/**
 * <h4>ICombination</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public interface ICombination
	{
	/**
	 * @since 0.1.0
	 */
	public int getRank();

	/**
	 * @since 0.1.0
	 */
	public Type getType();

	/**
	 * @since 0.1.0
	 */
	public int getValue();
	}
