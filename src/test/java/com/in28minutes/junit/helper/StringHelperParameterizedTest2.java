package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest2 {

	StringHelper helper = new StringHelper();
	
	private String input;
	private boolean expectedOutput;
	
	public StringHelperParameterizedTest2(String input, boolean expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Object[][] testParameters(){
		return new Object[][]{
			{"AACDAA", true},
			{"AACDA", false}
		};
	}


//	@Test
//	public void testTruncateAInFirst2Positions() {
//		StringHelper helper = new StringHelper();
//		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}

}
