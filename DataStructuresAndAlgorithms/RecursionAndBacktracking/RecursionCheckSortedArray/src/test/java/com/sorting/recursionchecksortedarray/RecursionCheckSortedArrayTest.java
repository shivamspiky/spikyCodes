package com.sorting.recursionchecksortedarray;

import org.junit.Test;

import com.recursion.checksortedarray.RecursionCheckSortedArray;

public class RecursionCheckSortedArrayTest {

	@Test
	public void isArraySortedTest() {

		RecursionCheckSortedArray recursionCheckSortedArray = new RecursionCheckSortedArray();
		int[] arr = { 1, 2, 3, 1, 10, 22, 233, 3535, 513514 };
		boolean isSorted = recursionCheckSortedArray.isArraySorted(arr, 0,
				arr.length - 1);
		System.out.println(isSorted);
	}

}
