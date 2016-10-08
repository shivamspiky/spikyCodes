package com.dp.maxsumsubsequence;

public class MaximumSumSubsequence {
	public int maxSum(int[] arr) {

		if (arr.length == 1) {
			return arr[0];
		} else if (arr.length == 2) {
			return Math.max(arr[0], arr[1]);
		}

		int maxSumOfSubsequence[] = new int[arr.length];
		maxSumOfSubsequence[0] = arr[0];
		maxSumOfSubsequence[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			maxSumOfSubsequence[i] = Math.max(maxSumOfSubsequence[i - 1],
					arr[i] + maxSumOfSubsequence[i - 2]);
		}
		
		return maxSumOfSubsequence[arr.length-1];
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,-3,4,5,-1,7,2,3,8,-11,23};
		MaximumSumSubsequence maximumSumSubsequence = new MaximumSumSubsequence();
		System.out.println(maximumSumSubsequence.maxSum(arr));
	}

}
