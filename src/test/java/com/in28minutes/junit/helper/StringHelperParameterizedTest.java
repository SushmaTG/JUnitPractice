package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper = new StringHelper();
	
	// define the constructor with the attributes accepting the parameters as values, every test is executed 
	// with one set of tuples
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	// define the testing parameters as a 2D array with actual and expected values as tuple
	@Parameters
	public static Collection<String[]> testParameters(){
		String parameters[][] = {
				{"AACD", "CD"},
				{"ACD", "CD"}
		};
		return Arrays.asList(parameters);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}

//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame() {
//		StringHelper helper = new StringHelper();
//		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AACDAA"));
//	}

}
