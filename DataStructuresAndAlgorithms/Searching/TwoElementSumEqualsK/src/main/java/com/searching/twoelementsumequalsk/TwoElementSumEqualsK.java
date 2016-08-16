package com.searching.twoelementsumequalsk;

import java.util.Arrays;

public class TwoElementSumEqualsK {

	public void twoElementSum(int[] arr, int k) {

		Arrays.sort(arr);
		int i;
		int j;
		int temp;
		for (i = 0, j = arr.length - 1; i < j;) {

			temp = arr[i] + arr[j];
			if (temp == k) {

				System.out.println("Two Elements are " + arr[i] + " and "
						+ arr[j]);
				return ;
			}

			else if (temp < k) {
				i++;
			} else {
				j--;
			}
		}

		System.out.println("No Elements with Sum " + k);
		return;
	}

}
