package net;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.BodySubscribers;
import java.net.http.HttpResponse.ResponseInfo;
import java.util.function.Function;
import image.Image;

public final class ImageHandler implements IContentHandler<BufferedImage>
	{
	@Override
	public BodySubscriber<BufferedImage> apply(final ResponseInfo responseInfo)
		{
		final Function<InputStream, BufferedImage> inputStreamToBufferedImage = input ->
			{
			try
				{
				return Image.read(input);
				}
			catch (final IOException ex)
				{
				throw new UncheckedIOException(ex);
				}
			};

		return BodySubscribers.mapping(BodySubscribers.ofInputStream(), inputStreamToBufferedImage);

		/*
		// BodySubscriber<InputStream> upstream = BodySubscribers.ofInputStream();

     BodySubscriber<Supplier<W>> downstream = BodySubscribers.mapping(
           upstream,
           (InputStream is) -> () -> {
               try (InputStream stream = is) {
                   ObjectMapper objectMapper = new ObjectMapper();
                   return objectMapper.readValue(stream, targetType);
               } catch (IOException e) {
                   throw new UncheckedIOException(e);
               }
           });
    return downstream;
	*/
		}
	}
