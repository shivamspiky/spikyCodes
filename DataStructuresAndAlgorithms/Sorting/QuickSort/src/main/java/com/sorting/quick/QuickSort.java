package com.sorting.quick;

public class QuickSort {

	public void sort(int[] arr, int start, int end) {

		if (start < end) {

			int p = partition(arr, start, end);

			sort(arr, start, p - 1);
			sort(arr, p + 1, end);
		}
	}

	private int partition(int[] arr, int start, int end) {

		int pivot = arr[end];

		int j = start;

		for (int i = start; i < end; i++) {

			if (arr[i] <= pivot) {

				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}

		arr[end] = arr[j];
		arr[j] = pivot;

		return j;
	}

}
