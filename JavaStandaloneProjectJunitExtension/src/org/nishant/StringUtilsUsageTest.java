package org.nishant;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringUtilsUsageTest {

	private StringUtilsUsage target;

	@Before
	public void setUp() throws Exception {
		target = new StringUtilsUsage();
	}

	@Test
	public void testBlankStringTrue() {
		assertTrue(target.blankString(""));
	}

	@Test
	public void testBlankStringFalse() {
		assertFalse(target.blankString("ahfshh"));
	}

	@Test
	public void testNotBlankStringFalse() {
		assertFalse(target.notBlankString(""));
	}

	@Test
	public void testNotBlankStringTrue() {
		assertTrue(target.notBlankString("ahfshh"));
	}
}