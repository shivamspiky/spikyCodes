package com.searching.maximumfrequencyelement;

import org.junit.Test;

public class MaximumFrequencyElementTest {

	@Test
	public void MaxOccuringElementTest() {

		MaximumFequencyElement maximumFequencyElement = new MaximumFequencyElement();
		int[] arr = { 1, 3, 5, 5, 5, 2 };
		int maxOccuring = maximumFequencyElement.maxOccuringElement(arr);
		System.out.println(maxOccuring);
	}

}
