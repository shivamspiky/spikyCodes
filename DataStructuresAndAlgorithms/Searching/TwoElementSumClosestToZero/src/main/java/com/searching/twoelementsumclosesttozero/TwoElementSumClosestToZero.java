package com.searching.twoelementsumclosesttozero;

import java.util.Arrays;

public class TwoElementSumClosestToZero {

	public int closestToZero(int[] arr) {

		Arrays.sort(arr);

		int i = 0;
		int j = arr.length - 1;
		int posSum = Integer.MAX_VALUE;
		int poslow = 0;
		int poshigh = arr.length - 1;
		int negSum = Integer.MIN_VALUE;
		int neglow = 0;
		int neghigh = arr.length - 1;
		int sum;
		while (i < j) {

			sum = arr[i] + arr[j];

			if (sum > 0) {
				if (sum < posSum) {
					posSum = sum;
					poslow = i;
					poshigh = j;
				}

				j--;
			} else if (sum < 0) {

				if (sum > negSum) {

					negSum = sum;
					neglow = i;
					neghigh = j;
				}

				i++;
			} else {

				return 0;
			}

		}

		if (Math.abs(negSum) < posSum) {
			System.out.println("Two Elements are " + arr[neglow] + " and "
					+ arr[neghigh]);
			return negSum;
		} else {
			System.out.println("Two Elements are " + arr[poslow] + " and "
					+ arr[poshigh]);
			return posSum;
		}

	}

}
