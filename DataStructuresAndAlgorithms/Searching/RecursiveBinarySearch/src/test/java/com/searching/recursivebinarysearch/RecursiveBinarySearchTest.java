package com.searching.recursivebinarysearch;

import org.junit.Test;

public class RecursiveBinarySearchTest {

	@Test
	public void binarySearchTest() {
		RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
		int arr[] = {1,3,5,7,232,1353,13531,2235325};
		int index = recursiveBinarySearch.binarySearch(arr, 0, arr.length-1, 1353);
		System.out.println(index);
	}

}
