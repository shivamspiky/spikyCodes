package com.searching.firstpositiveelementinsortedarray;

public class FirstPositiveElementInSortedArray {

	public int firstPositiveElement(int[] arr, int low, int high) {

		if (low == high) {

			if (arr[low] > 0)
				return arr[low];
			else
				return -1;
		}

		if (high - low == 1) {

			if (arr[low] > 0) {
				return arr[low];
			}

			else if (arr[high] > 0) {
				return arr[high];
			}

			return -1;
		}
		int mid;

		while (low <= high) {

			mid = low + (high - low) / 2;

			if (arr[mid] > 0 && arr[mid - 1] <= 0) {
				return arr[mid];
			}

			else if (arr[mid] > 0 && arr[mid - 1] > 0) {
				high = mid - 1;
			}

			else {

				low = mid + 1;
			}
		}

		return -1;

	}

}
