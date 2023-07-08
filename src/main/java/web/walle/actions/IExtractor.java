package web.walle.actions;

import org.jsoup.nodes.Document;
import actions.IOperation;
import annotations.WorkInProgress;

@WorkInProgress
public interface IExtractor<T> extends IOperation<Document, T>
	{
	@WorkInProgress
	public T extract(Document document);
	}
