package com.dp.largestsumcontigoussubarray;

public class LargestSumContiguousSubArray {

	public int largestSum(int[] arr) {
		int largestSum = arr[0];
		int currentSum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			currentSum = Math.max(currentSum + arr[i], arr[i]); //
			largestSum = Math.max(largestSum, currentSum);
		}

		return largestSum;
	}
	
	public static void main(String args[]){
		int arr1[] = {1,-2,3,-2,8};
		
		LargestSumContiguousSubArray largestSumContiguousSubArray = new LargestSumContiguousSubArray();
		int result = largestSumContiguousSubArray.largestSum(arr1);
		System.out.println(result);
	}

}
