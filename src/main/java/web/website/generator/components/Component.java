package web.website.generator.components;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

/**
 * <h4>Component</h4>
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
@WorkInProgress
public class Component implements IComponent
	{
	protected final Map<String, IComponent> components = new HashMap<>();

	/**
	 * @since 0.1.0
	 */
	@Override
	public final Collection<IComponent> getComponents()
		{
		return components.values();
		}

	/**
	 * @throws NotImplementedException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public final IComponent getComponent(final String name)
		{
		throw new NotImplementedException();
		}

	/**
	 * @throws NotImplementedException
	 * 
	 * @since 0.1.0
	 */
	@Override
	public String layout()
		{
		throw new NotImplementedException();
		}
	}
