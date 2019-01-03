package com.tcs.samplemavenproject1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunitTest {

	private TestJunit tj;
	private static final String tostringmsg = "TestJunit [strName=aarti, strAge=16, salary=10]";

	private TestJunit defaultConstructor() {
		TestJunit tj1 = new TestJunit();
		tj1.setStrName("aarti");
		tj1.setStrAge(16);
		tj1.setSalary(10);
		return tj1;
	}

	@BeforeClass
	public static void runBeforeclass() {
		System.out.println("@BeforeClass---run before class");
	}

	@Before
	public void beforeTestMethod() {
		System.out.println("@Before---run before test method");
		tj = defaultConstructor();
	}

	@Test
	public void testGetters() {

		// tj = defaultConstructor();
		System.out.println("testing get methods");
		assertEquals("aarti", tj.getStrName());
		assertEquals(16, tj.getStrAge());
		assertEquals(10, tj.getSalary());

	}

	@Test
	public void testParamConstructor() {
		System.out.println("testing parameterized constructor");
		tj = new TestJunit("Aanya", 4, 500);
		assertEquals("Aanya", tj.getStrName());
		assertEquals(4, tj.getStrAge());
		assertEquals(500, tj.getSalary());

	}

	@Test
	public void testHashCode() {
		System.out.println("testing hashcode method");
		// tj = defaultConstructor();
		assertNotNull(tj.hashCode());
	}

	@Test
	public void testtoString() {

		System.out.println("testing toString method");
		// tj = defaultConstructor();
		assertNotSame(" ", tj.toString());
		assertEquals(tostringmsg, tj.toString());
	}

	@Test
	public void testequals() {

		System.out.println("testing equals method");
		TestJunit tj2 = defaultConstructor();
		TestJunit tj4 = tj;
//		TestJunit tj3 = new TestJunit("Aanya", 4, 500);
//		// tj = defaultConstructor();
//		assertTrue(tj2.equals(tj));
//		assertFalse(tj3.equals(tj));
		assertTrue(tj4.equals(tj));
		assertEquals(tj2, tj);
		assertEquals(tj2.getClass(), tj.getClass());
		assertEquals(tj2.getStrName(), tj.getStrName());
		assertEquals(tj2.getStrAge(), tj.getStrAge());
		assertEquals(tj2.getSalary(), tj.getSalary());
	}

	@Test
	public void testDoArrayListWork() {
		tj.doArrayListWork();

	}

	@AfterClass
	public static void runAfterclass() {
		System.out.println("@AfterClass---run after class");
	}

}
