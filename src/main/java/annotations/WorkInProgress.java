package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @version 0.1.0
 * @since 0.1.0
 */
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
public @interface WorkInProgress
	{
	}
