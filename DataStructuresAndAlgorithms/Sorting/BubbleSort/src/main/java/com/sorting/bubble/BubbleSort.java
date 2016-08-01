package com.sorting.bubble;

/**
 * @author : shivam kumar
 * 
 *         Improved Bubble Sort Implementation i.e. improves best case
 *         complexity to O(n).
 */

public class BubbleSort {

	public int[] sort(int[] ar) {

		int n = ar.length;
		int i;
		int swapped = 1;
		for (int pass = n - 1; pass >= 1 && swapped != 0; pass = pass - 1) {

			swapped = 0;
			for (i = 0; i < pass; i++) {

				if (ar[i] > ar[i + 1]) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
					swapped = 1;
				}
			}
		}

		return ar;

	}
}
