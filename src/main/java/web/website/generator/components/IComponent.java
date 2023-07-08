package web.website.generator.components;

import java.util.Collection;
import annotations.WorkInProgress;

/**
 * <h4>IComponent</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public interface IComponent
	{
	/**
	 * @since 0.1.0
	 */
	public Collection<IComponent> getComponents();

	/**
	 * @since 0.1.0
	 */
	public IComponent getComponent(String name);

	/**
	 * @since 0.1.0
	 */
	public String layout();
	}
