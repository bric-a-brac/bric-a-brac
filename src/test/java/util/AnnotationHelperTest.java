package util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnnotationHelperTest extends Assertions
	{
	@Test
	public void testGetAnnotation()
		{
		Optional<Note> note = AnnotationHelper.getAnnotation(WithNote.class, Note.class);

		assertTrue(note.isPresent());

		note = AnnotationHelper.getAnnotation(WithoutNote.class, Note.class);

		assertFalse(note.isPresent());

		// TODO: Multiple annotations
		assertThrowsExactly(IllegalStateException.class, () ->
			{
			AnnotationHelper.getAnnotation(WithNotes.class, Note.class);
			});
		}
	}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Notes
	{
	Note[] value();
	}

@Repeatable(Notes.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Note
	{
	}

@Note
class WithNote
	{
	}

@Note
@Note
@Note
class WithNotes
	{
	}

class WithoutNote
	{
	}
