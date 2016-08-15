package com.searching.recursivebinarysearch;

public class RecursiveBinarySearch {

	public int binarySearch(int[] arr, int start, int end, int key) {

		if (start > end) {
			return -1;
		}

		int mid = start + (end - start) / 2;

		if (arr[mid] == key) {
			return mid;
		}

		else if (arr[mid] < key) {

			return binarySearch(arr, mid + 1, end, key);
		}

		else {
			return binarySearch(arr, start, mid - 1, key);
		}

	}

}
