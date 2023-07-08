package web.walle.actions;

import actions.IOperation;
import annotations.WorkInProgress;

@WorkInProgress
public interface ICleaner<T, R> extends IOperation<T, R>
	{
	public void clean();
	}
