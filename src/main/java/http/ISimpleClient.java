package http;

import java.awt.image.BufferedImage;
import java.net.URI;
import org.jsoup.nodes.Document;
import annotations.WorkInProgress;

@WorkInProgress
public interface ISimpleClient
	{
	@WorkInProgress
	public String getAsString(URI uri);
	public String getAsString(String uri);

	@WorkInProgress
	public Document getAsDocument(URI uri);
	public Document getAsDocument(String uri);

	@WorkInProgress
	public BufferedImage getAsImage(URI uri);
	public BufferedImage getAsImage(String uri);
	}
