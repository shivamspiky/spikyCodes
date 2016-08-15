package com.searching.findingduplicates;

public class FindingDuplicates {

	public int findDuplicateEntry(int[] arr) {

		int i;
		for (i = 0; i < arr.length; i++) {

			if (arr[Math.abs(arr[i])] < 0) {
				return Math.abs(arr[i]);
			}
			arr[Math.abs(arr[i])] *= -1;
		}

		return -1;
	}

}
