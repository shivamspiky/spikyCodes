package com.sorting.counting;

import org.junit.Test;

public class CountingSortTest {

	@Test
	public void testSort() {

		int[] arr = { 9, 3, 2, 3, 1, 0, 3, 8, 1, 4, 7, 3, 9, 2, 4 };

		CountingSort countingSort = new CountingSort();
		countingSort.sort(arr, 9);

		System.out.println("==========Sorted Array==============");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
	}

}
