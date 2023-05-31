package io;

import java.io.ObjectInputStream;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@FunctionalInterface
public interface IObjectReader<T> extends IReader<ObjectInputStream, T, ReflectiveOperationException>
	{
	}
