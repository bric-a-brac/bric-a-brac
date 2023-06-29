package wip;

import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.BodySubscribers;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.apache.commons.math3.exception.NullArgumentException;
import annotations.WorkInProgress;

import static util.Argument.notNull;

@WorkInProgress
public class HTTP
	{
	public static final BodyHandler<String> ISO_8859_1_TO_UTF_8 = responseInfo -> ofString(StandardCharsets.ISO_8859_1, StandardCharsets.UTF_8);

	/**
	 * @throws NullArgumentException
	 */
	public static final BodySubscriber<String> ofString(final Charset from, final Charset to)
		{
		notNull(from);
		notNull(to);

		return BodySubscribers.mapping(BodySubscribers.ofString(from), body -> new String(body.getBytes(from), to));
		}
	}
