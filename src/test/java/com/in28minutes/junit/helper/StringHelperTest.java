package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		StringHelper helper = new StringHelper();
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AACDAA"));
	}

}
