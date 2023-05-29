package util;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class ReflectionHelper
	{
	// InstantiationException extends ReflectiveOperationException
	// IllegalAccessException extends ReflectiveOperationException
	// IllegalArgumentException extends RuntimeException
	// InvocationTargetException extends ReflectiveOperationException
	// NoSuchMethodException extends ReflectiveOperationException
	// SecurityException extends RuntimeException

	/**
	 * <p>Créé une nouvelle instance <code>Class&lt;T&gt;</code> depuis son constructeur par défaut.</p>
	 * 
	 * @throws NullArgumentException
	 * @throws ReflectiveOperationException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * 
	 * @since 0.1.0
	 */
	public static final <T> T newInstance(final Class<T> classOfT) throws ReflectiveOperationException
		{
		notNull(classOfT);

		return classOfT.cast(classOfT.getConstructor().newInstance());
		}

	/**
	 * @throws NullArgumentException
	 * @throws ReflectiveOperationException
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * 
	 * @since 0.1.0
	 */
	public static final Object newInstance(final String className) throws ReflectiveOperationException
		{
		return newInstance(Class.forName(notNull(className)));
		}

	/**
	 * @since 0.1.0
	 */
	public static final <T extends Member> Predicate<T> isMemberOf(final String namespace)
		{
		notNull(namespace);

		return member -> member.getDeclaringClass().getName().startsWith(namespace);
		}

	/**
	 * @since 0.1.0
	 */
	public static final Stream<Field> getFields(final Class<?> clazz)
		{
		return Arrays.asList(notNull(clazz).getFields()).stream();
		}

	/**
	 * @since 0.1.0
	 */
	public static final Stream<Field> getFields(final Class<?> clazz, final Predicate<Field> predicate)
		{
		return getFields(clazz).filter(notNull(predicate));
		}

	/**
	 * @since 0.1.0
	 */
	public static final Stream<Field> getFields(final Class<?> clazz, final String namespace)
		{
		return getFields(clazz, isMemberOf(namespace));
		}

	/**
	 * @since 0.1.0
	 */
	public static final Stream<Method> getMethods(final Class<?> clazz)
		{
		return Arrays.asList(notNull(clazz).getMethods()).stream();
		}

	/**
	 * @since 0.1.0
	 */
	public static final Stream<Method> getMethods(final Class<?> clazz, final Predicate<Method> predicate)
		{
		return getMethods(clazz).filter(notNull(predicate));
		}

	/**
	 * @since 0.1.0
	 */
	public static final Stream<Method> getMethods(final Class<?> clazz, final String namespace)
		{
		return getMethods(clazz, isMemberOf(namespace));
		}
	}
