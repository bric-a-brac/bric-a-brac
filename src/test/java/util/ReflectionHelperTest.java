package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import util.exceptions.NullArgumentException;

public class ReflectionHelperTest extends Assertions
	{
	@Test
	public void testNewInstance() throws ReflectiveOperationException
		{
		assertThrowsExactly(NullArgumentException.class, () ->
			{
			ReflectionHelper.newInstance((Class<?>) null);
			});

		assertThrowsExactly(NullArgumentException.class, () ->
			{
			ReflectionHelper.newInstance((String) null);
			});

		assertThrowsExactly(ClassNotFoundException.class, () ->
			{
			ReflectionHelper.newInstance("util.ReflectionHelperTestXYZ");
			});

		assertNotNull(ReflectionHelper.newInstance(ReflectionHelperTest.class));

		assertNotNull(ReflectionHelper.newInstance("util.ReflectionHelperTest"));
		}

	@Test
	public void testGetFields()
		{
		assertEquals(0L, ReflectionHelper.getFields(Object.class).count());

		assertEquals(3L, ReflectionHelper.getFields(TestClass.class).count());

		assertEquals(2L, ReflectionHelper.getFields(TestClass.class, field -> !field.getName().startsWith("b")).count());
		}

	@Test
	public void testGetMethods()
		{
		assertEquals(9L, ReflectionHelper.getMethods(Object.class).count());

		assertEquals(14L, ReflectionHelper.getMethods(TestClass.class).count());

		// getClass, getA, getB
		assertEquals(3L, ReflectionHelper.getMethods(TestClass.class, method -> method.getName().startsWith("get")).count());

		assertEquals(5L, ReflectionHelper.getMethods(TestClass.class, "util.").count());
		}
	}

@SuppressWarnings("unused")
class TestClass
	{
	public String a;
	public String b;
	public String c;
	protected int d;
	protected int e;
	private Class<?> f;
	private Object g;

	public void getA(){}
	public void getB(){}
	protected void getC(){}
	private void getD(){}
	public void a(){}
	public void b(){}
	public void c(){}
	protected void d(){}
	protected void e(){}
	private void f(){}
	private void g(){}
	}
