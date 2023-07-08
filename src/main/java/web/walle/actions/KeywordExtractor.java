package web.walle.actions;

import java.util.List;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;
import html.Parser;

@WorkInProgress
public final class KeywordExtractor extends Action implements IExtractor<List<String>>
	{
	@Override
	@WorkInProgress
	public List<String> extract(final Document document)
		{
		return Parser.links(document);
		}

	@Override
	@WorkInProgress
	public void execute(final Document document)
		{
		System.out.println(extract(document));
		}
	}
