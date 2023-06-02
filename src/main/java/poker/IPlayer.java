package poker;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public interface IPlayer<T extends IHand<?>>
	{
	/**
	 * @since 0.1.0
	 */
	public String getName();

	/**
	 * @since 0.1.0
	 */
	public T getHand();

	/**
	 * @since 0.1.0
	 */
	@Deprecated
	public void setHand(T hand);
	}
