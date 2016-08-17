package com.searching.maximumelementinbitonicsearch;

public class MaximumElementInBitonicSearch {

	public int maximumElement(int[] arr, int low, int high) {

		if (low == high) {
			return arr[low];
		}

		if (high - low == 1) {
			return Math.max(arr[low], arr[high]);
		}
		int mid;

		while (low <= high) {
			mid = low + (high - low) / 2;

			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {

				return arr[mid];
			}

			else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return -1;

	}

}
