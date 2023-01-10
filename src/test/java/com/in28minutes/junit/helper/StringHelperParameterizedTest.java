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
	
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String output) {
		this.input = input;
		this.expectedOutput = output;
	}
	
	StringHelper helper = new StringHelper();

	@Parameters
	public static Collection<String[]> testCondition() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirstTwoPositions() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
