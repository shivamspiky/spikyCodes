package com.sorting.insertion;

/**
 * @author shivam.kumar
 * 
 *         InsertionSort Implementation
 */
public class InsertionSort {

	public int[] sort(int[] arr) {

		for (int i = 1; i <= arr.length - 1; i++) {

			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0 && arr[j] > temp; j--) {

				arr[j + 1] = arr[j];
			}

			arr[j + 1] = temp;
		}

		return arr;

	}

}
