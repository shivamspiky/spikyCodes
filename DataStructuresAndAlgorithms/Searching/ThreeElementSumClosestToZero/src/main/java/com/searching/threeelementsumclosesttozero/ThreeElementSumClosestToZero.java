package com.searching.threeelementsumclosesttozero;

import java.util.Arrays;

public class ThreeElementSumClosestToZero {

	public void threeElementSum(int[] arr) {

		int i, j, k;
		int posSum = Integer.MAX_VALUE-1;
		int negSum = Integer.MIN_VALUE+1;
		int poslow = 0;
		int poshigh = 0;
		int neglow = 0;
		int neghigh = 0;
		int firstIndex = 0;
		int tempSum;

		Arrays.sort(arr);

		for (i = 0; i < arr.length-2; i++) {

			j = i + 1;
			k = arr.length - 1;
			while (j < k) {

				tempSum = arr[i] + arr[j] + arr[k];

				if (tempSum == 0) {

					System.out.println("Three elements are " + arr[i] + ", "
							+ arr[j] + " and " + arr[k]);
					return;
				}

				else if (tempSum > 0) {

					if (tempSum < posSum) {
						posSum = tempSum;
						poslow = j;
						poshigh = k;
						firstIndex = i;
					}

					k--;
				}

				else {

					if (tempSum > negSum) {
						negSum = tempSum;
						neglow = j;
						neghigh = k;
						firstIndex = i;
					}

					j++;

				}

			}

		}

		if (posSum < Math.abs(negSum)) {

			System.out.println("Three elements are " + arr[firstIndex] + ", "
					+ arr[poslow] + " and " + arr[poshigh]);
		} else {

			System.out.println("Three elements are " + arr[firstIndex] + ", "
					+ arr[neglow] + " and " + arr[neghigh]);
		}

	}
}
