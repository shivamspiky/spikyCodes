package com.dp.largestsumcontigoussubarray;

public class LargestSumContiguousSubArray {

	public int largestSum(int[] arr) {
		
		/*max we have seen so far which is maximum of current sum and max*/
		int largestSum = arr[0];
		/*max sum including this element is going to be max of max sum including last element plus this
		 * element or this element itself*/
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
