package com.arrays.equilibrium;

public class EquilibriumIndex {
	public int index(int[] arr) {
		if (arr.length < 3) {
			return -1;
		}
		int sum = 0;
		int leftSum = arr[0];
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (i = 1; i < arr.length - 1; i++) {
			if (sum - leftSum - arr[i] == leftSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {-7,1,5,2,-4,3,0};
		EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
		int result = equilibriumIndex.index(arr);
		System.out.println(result);
	}
}
