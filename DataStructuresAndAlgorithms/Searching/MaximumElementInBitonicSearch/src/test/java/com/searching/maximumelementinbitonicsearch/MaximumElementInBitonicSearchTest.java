package com.searching.maximumelementinbitonicsearch;

import org.junit.Test;

public class MaximumElementInBitonicSearchTest {

	@Test
	public void maximumElementTest() {

		MaximumElementInBitonicSearch maximumElementInBitonicSearch = new MaximumElementInBitonicSearch();

		int arr[] = { 1, 2,0};
		int result = maximumElementInBitonicSearch.maximumElement(arr, 0,
				arr.length - 1);

		System.out.println(result);
	}

}
