package io;

import java.io.IOException;
import java.io.ObjectInputStream;
import org.apache.commons.lang3.NotImplementedException;

import static util.Argument.notNull;

public final class ObjectReader<T> implements IObjectReader<T>
	{
	@SuppressWarnings("unused")
	private final Class<T> classOfT;

	public ObjectReader(final Class<T> classOfT)
		{
		super();

		this.classOfT = notNull(classOfT);
		}

	@Override
	public T read(final ObjectInputStream input) throws IOException, ReflectiveOperationException
		{
		//return classOfT.cast(input.readObject());
		throw new NotImplementedException();
		}
	}
