package com.arrays.maximumdifference;

public class MaximumDifference {

	public int maxDiff(int[] arr) {

		int max=Integer.MIN_VALUE;
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]-min > max){
				max = arr[i] - min;
			}
			if(arr[i] < min){
				min =  arr[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]){
		int[] arr = { 7, 9, 5, 6, 3, 2};
		
		MaximumDifference maximumDifference = new MaximumDifference();
		System.out.println(maximumDifference.maxDiff(arr));
	}

}
