package com.dp.maxsumsubseqeunce;

public class MaxSumSubsequnce {
	public int maxSum(int[] arr) {

		if (arr.length == 1) {
			return arr[0];
		}

		else if (arr.length == 2) {
			return Math.max(Math.max(arr[0], arr[1]), arr[1] + arr[0]);
		}

		else if (arr.length == 3) {
			return Math.max(
					Math.max(Math.max(
							Math.max(Math.max(arr[0], arr[1]), arr[2]), arr[0]
									+ arr[1]), arr[1] + arr[2]), arr[0]
							+ arr[2]);
		}
		int[] maxSumOfSubseqeunce = new int[arr.length];

		maxSumOfSubseqeunce[0] = arr[0];
		maxSumOfSubseqeunce[1] = Math.max(Math.max(arr[0], arr[1]), arr[1]
				+ arr[0]);
		maxSumOfSubseqeunce[2] = Math.max(Math.max(
				Math.max(Math.max(Math.max(arr[0], arr[1]), arr[2]), arr[0]
						+ arr[1]), arr[1] + arr[2]), arr[0] + arr[2]);

		for (int i = 3; i < arr.length; i++) {
			maxSumOfSubseqeunce[i] = Math.max(maxSumOfSubseqeunce[i - 1], Math.max(arr[i] + arr[i - 1]
					+ maxSumOfSubseqeunce[i - 3], arr[i]
					+ maxSumOfSubseqeunce[i - 2]));
		}

		return maxSumOfSubseqeunce[arr.length - 1];
	}

	public static void main(String args[]) {
		MaxSumSubsequnce maxSumSubsequnce = new MaxSumSubsequnce();
		int[] arr = { 1, 2, -3, 4, 5, -1, 7, 2 };
		System.out.println(maxSumSubsequnce.maxSum(arr));
	}

}
