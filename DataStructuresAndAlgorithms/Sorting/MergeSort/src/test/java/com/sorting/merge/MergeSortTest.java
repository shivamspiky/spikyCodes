package com.sorting.merge;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test() {

		int[] arr = { 1, 3, 3, 2, 1, 0, 89, 4, 23, 39, 23, 23442, 86 };
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);

		System.out.println("============Sorted Array===============");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
