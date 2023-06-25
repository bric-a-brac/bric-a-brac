package websitegenerator.event;

import java.util.EventListener;
import annotations.WorkInProgress;

@WorkInProgress
public interface IEventListener extends EventListener
	{
	public void onGet(GetEvent event);
	}
