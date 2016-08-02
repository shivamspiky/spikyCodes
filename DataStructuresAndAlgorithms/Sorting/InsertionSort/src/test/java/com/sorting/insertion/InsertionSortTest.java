package com.sorting.insertion;

import org.junit.Test;

/**
 * @author shivam.kumar
 * 
 *         Junits for InsertionSort
 */

public class InsertionSortTest {

	@Test
	public void testSort() {

		int[] arr = { 2, 1, 8, 3, 2, 0, 23, 3523, 13, 16 };
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(arr);

		System.out.println("================Sorted Array================");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
