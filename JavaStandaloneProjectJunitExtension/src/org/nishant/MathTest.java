package org.nishant;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Sample Junit test case to test Math class
 * 
 * @author nishant
 */
public class MathTest {

	private Math target;

	@Before
	public void setUp() throws Exception {
		target = new Math();
	}

	@Test
	public void testAdd() {
		int a = 1;
		int b = 1;
		int expected = 2;
		int actual = target.add(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 2;
		int b = 1;
		int expected = 1;
		int actual = target.subtract(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 2;
		int b = 2;
		int expected = 4;
		int actual = target.multiply(a, b);
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		int a = 4;
		int b = 2;
		int expected = 2;
		int actual = target.divide(a, b);
		assertEquals(expected, actual);
	}
}