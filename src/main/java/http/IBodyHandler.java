package http;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.ResponseInfo;
import org.apache.commons.lang3.NotImplementedException;
import annotations.WorkInProgress;

@WorkInProgress
@FunctionalInterface
public interface IBodyHandler<T> extends IContentHandler<ResponseInfo, BodyHandler<T>, IOException>
	{
	public static final IBodyHandler<BufferedImage> IMAGE = responseInfo ->
		{
		throw new NotImplementedException();
		};
	}
