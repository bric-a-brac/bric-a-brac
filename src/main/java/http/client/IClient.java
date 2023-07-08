package http.client;

import java.io.IOException;
import java.net.URI;
import annotations.WorkInProgress;
import util.Argument;
import util.exceptions.EmptyArgumentException;
import util.exceptions.NullArgumentException;

@WorkInProgress
public interface IClient
	{
	//public static final BodyHandler<byte[]> BYTES = responseInfo -> BodySubscribers.mapping(BodySubscribers.ofString(StandardCharsets.UTF_8), String::getBytes);
	//public static final BodyHandler<byte[]> BYTES = BodyHandlers.ofByteArray();

	//public static final BodyHandler<String> TEXT = responseInfo -> BodySubscribers.ofString(StandardCharsets.UTF_8);
	//public static final BodyHandler<String> TEXT = BodyHandlers.ofString();

	//public static final BodyHandler<Document> HTML = responseInfo -> BodySubscribers.mapping(BodySubscribers.ofString(StandardCharsets.UTF_8), Jsoup::parse);

	// TODO: HTML parse(html, uri)
	//public static final BodyHandler<Document> HTMLbis = responseInfo -> null;

	//public static final BodyHandler<BufferedImage> IMAGE = responseInfo -> null;

	/**
	 * @since 0.1.0
	 */
	public String getUserAgent();

	@WorkInProgress
	public <T> IResponse<T> get(IRequest.IGet<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> post(IRequest.IPost<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> put(IRequest.IPut<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> delete(IRequest.IDelete<T> request) throws IOException, InterruptedException;

	@WorkInProgress
	public <T> IResponse<T> send(IRequest<T> request) throws IOException, InterruptedException;

	/**
	 * @throws NullArgumentException
	 * @throws EmptyArgumentException
	 * @throws IllegalArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static URI uriFromString(final String uri)
		{
		return URI.create(Argument.notEmpty(uri));
		}
	}
