package com.sorting.merge;

public class MergeSort {

	public int[] sort(int[] arr) {

		int start=0;
		int end=arr.length-1;
		if (start < end) {

			int mid = start + (end - start) / 2;
			int[] arrLeft = new int[mid - start + 1];
			int[] arrRight = new int[end - mid];

			for (int i = 0; i < mid - start + 1; i++) {

				arrLeft[i] = arr[start + i];
			}

			for (int i = 0; i < end - mid; i++) {

				arrRight[i] = arr[mid + 1 + i];
			}

			sort(arrLeft);
			sort(arrRight);
			arr = merge(arr, arrLeft, arrRight);

		}
		return arr;

	}

	private int[] merge(int[] arr, int[] arrLeft, int[] arrRight) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arrLeft.length && j < arrRight.length && k < arr.length) {

			if (arrLeft[i] <= arrRight[j]) {

				arr[k] = arrLeft[i];
				k++;
				i++;
			} else {

				arr[k] = arrRight[j];
				k++;
				j++;
			}
		}

		if (j >= arrRight.length) {

			while (i < arrLeft.length && k < arr.length) {
				arr[k] = arrLeft[i];
				k++;
				i++;
			}
		} else if (i >= arrLeft.length-1) {

			while (j < arrRight.length && k < arr.length) {
				arr[k] = arrRight[j];
				k++;
				j++;
			}
		}

		return arr;

	}

}
