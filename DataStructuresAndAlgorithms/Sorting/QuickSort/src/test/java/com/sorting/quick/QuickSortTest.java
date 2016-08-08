package com.sorting.quick;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testSort() {

		int[] arr = { 3, 9, 1, 8, 5, 3, 2, 57, 12, 123, 139 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr, 0, arr.length - 1);

		System.out.println("===================Sorted Array==============");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}
