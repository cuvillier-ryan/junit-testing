package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	// Array.sort

	@Test
	public void testArraySort() {
		int[] numbers = { 12, 2, 6, 1, 11 };
		int[] expected = { 1, 2, 6, 11, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);

	}

}
