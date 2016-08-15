package com.searching.maximumfrequencyelement;

public class MaximumFequencyElement {

	public int maxOccuringElement(int[] arr) {

		int i;
		for (i = 0; i < arr.length; i++) {

			arr[arr[i] % arr.length] += arr.length;
		}
		int max = -1;
		int maxElement = -1;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] / arr.length > max) {
				max = arr[i] / arr.length;
				maxElement = i;
			}
		}

		return maxElement;

	}

}
