package net.api;

import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.NotImplementedException;
import annotations.Discontinued;
import net.Client;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Discontinued
@SuppressWarnings("unused")
public class API extends Client
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public API(final String userAgent)
		{
		//super(userAgent);
		super();
		}

	/**
	 * @since 0.1.0
	 */
	protected <T> IEndPoint<T> getEndPoint(final Class<T> classOfT)
		{
		final var e = new EndPoint<T>();
		//return get(url, JSON(classOfT));
		throw new NotImplementedException();
		}

	/**
	 * @version 0.1.0
	 * @since 0.1.0
	 */
	public class EndPoint<T> implements IEndPoint<T>
		{
		/**
		 * @throws IOException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public T get() throws IOException
			{
			//API.super.get("url", IContentHandler.TEXT);
			throw new NotImplementedException();
			}

		/**
		 * @throws IOException
		 * 
		 * @since 0.1.0
		 */
		@Override
		public List<T> getAll() throws IOException
			{
			throw new NotImplementedException();
			}
		}
	}
