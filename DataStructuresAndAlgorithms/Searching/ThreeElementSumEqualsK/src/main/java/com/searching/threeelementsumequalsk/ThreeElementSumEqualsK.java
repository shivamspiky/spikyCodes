package com.searching.threeelementsumequalsk;

import java.util.Arrays;

public class ThreeElementSumEqualsK {

	public void threeElementSum(int[] arr, int data) {

		Arrays.sort(arr);

		int i, j, temp;

		for (int k = 0; k < arr.length; k++) {
			i = k + 1;
			j = arr.length - 1;
			while (i < j) {

				temp = arr[k] + arr[i] + arr[j];
				if (temp == data) {

					System.out.println("Three Elemets are " + arr[k] + " and "
							+ arr[i] + " and " + arr[j]);
					return;
				}

				else if (temp < data) {
					i++;

				}

				else {
					j--;
				}
			}
		}

		System.out.println("No Three Elements with sum " + data);
	}

}
