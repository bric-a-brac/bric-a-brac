package io;

import java.io.IOException;
import java.io.ObjectInputStream;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.math3.exception.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IObjectReader<T> extends IReader<ObjectInputStream, T, ReflectiveOperationException>
	{
	/**
	 * Truc pour éviter de devoir ajouter @SuppressWarnings("unchecked") ;-) mais ça fonctionne pas comme je veux avec interfaces et génériques... ;-(
	 * 
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static <T> IObjectReader<T> of(final Class<T> classOfT)
		{
		notNull(classOfT);

		return new IObjectReader<T>()
			{
			@Override
			public T read(final ObjectInputStream input) throws IOException, ReflectiveOperationException
				{
				//return classOfT.cast(input.readObject());
				throw new NotImplementedException();
				}
			};
		}
	}
