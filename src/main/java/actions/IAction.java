package actions;

import annotations.WorkInProgress;

@WorkInProgress
public interface IAction<T>
	{
	public void execute(T t);
	}
