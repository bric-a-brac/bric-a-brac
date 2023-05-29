package util;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Optional;
import util.exceptions.NullArgumentException;

import static util.Argument.notNull;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
public class AnnotationHelper
	{
	/**
	 * @throws NullArgumentException
	 * 
	 * @since 0.1.0
	 */
	public static final <T extends Annotation> Optional<T> getAnnotation(final AnnotatedElement element, final Class<T> classOfAnnotation)
		{
		final var annotations = notNull(element).getAnnotationsByType(notNull(classOfAnnotation));

		// TODO: > 1 !!!!!!!!
		if (annotations.length > 1)
			{
			throw new IllegalStateException("annotations.length > 1");
			}

		if (annotations.length == 1)
			{
			return Optional.of(annotations[0]);
			}

		return Optional.empty();
		}
	}
