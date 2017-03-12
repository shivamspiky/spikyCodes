package com.searching.iterativebinarysearch;

import org.junit.Test;

public class IterativeBinarySearchTest {

	@Test
	public void binarySearchTest() {
		
		IterativeBinarySearch iterativeBinarySearch = new IterativeBinarySearch();
		
		int[] arr =  {2,3,5,6,6,757,2508};
		int index = iterativeBinarySearch.recursiveBinarySearch(arr, 0, arr.length-1, 759);
		System.out.println(index);
	}

}
