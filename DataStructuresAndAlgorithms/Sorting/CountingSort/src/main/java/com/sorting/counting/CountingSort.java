package com.sorting.counting;

public class CountingSort {

	public void sort(int[] arr, int k) {

		int[] countingArray = new int[k + 1];
		int[] outputArray = new int[arr.length];
		int i;
		for (i = 0; i < k + 1; i++) {
			countingArray[i] = 0;
		}

		for (i = 0; i < arr.length; i++) {

			countingArray[arr[i]]++;
		}

		for (i = 1; i < k + 1; i++) {

			countingArray[i] += countingArray[i - 1];
		}

		for (i = 0; i < arr.length; i++) {

			outputArray[countingArray[arr[i]] - 1] = arr[i];

			countingArray[arr[i]]--;
		}

		for (i = 0; i < arr.length; i++) {

			arr[i] = outputArray[i];
		}

	}

}
