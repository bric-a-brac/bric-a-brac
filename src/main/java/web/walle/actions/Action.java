package web.walle.actions;

import java.util.function.BiConsumer;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;
import util.exceptions.NullArgumentException;
import web.walle.Axiom;

import static util.Argument.notNull;

@WorkInProgress
public class Action<T, U> implements BiConsumer<T, U>
	{
	protected final Axiom axiom;

	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public Action(final Axiom axiom)
		{
		super();

		this.axiom = notNull(axiom);
		}

	/**
	 * @throws NotImplementedException
	 */
	@Override
	@WorkInProgress
	public void accept(T t, U u)
		{
		throw new NotImplementedException();
		}
	}
