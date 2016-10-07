package com.arrays.bitonicsubarray;

public class MaximumLengthBitonicSubArray {
	public int maxLength(int[] arr){
		
		int incSubArray[] = new int[arr.length];
		int decSubArray[] = new int[arr.length];
		
		incSubArray[0]=1;
		for(int i=1;i<arr.length ; i++){
			if (arr[i] > arr[i-1]) {
				incSubArray[i]=incSubArray[i-1] + 1;
			} else{
				incSubArray[i] = 1;
			} 
		}
		
		decSubArray[arr.length-1] = 1;
		int max = Integer.MIN_VALUE;
		for(int i = arr.length-2; i >= 0 ; i-- ){
			if(arr[i] > arr[i+1]){
				decSubArray[i] = decSubArray[i+1] + 1;
			} else {
				decSubArray[i] = 1;
			}
		}
		
		for(int i = 0 ;i< arr.length ;i++){
			if(incSubArray[i] + decSubArray[i] - 1 > max){
				max = incSubArray[i] + decSubArray[i] - 1;
			}
		}
		return max;
	}
	
	public static void main(String args[]){
		MaximumLengthBitonicSubArray maximumLengthBitonicSubArray = new MaximumLengthBitonicSubArray();
		int[] arr = {12, 4, 78, 90, 45, 23};
		System.out.println(maximumLengthBitonicSubArray.maxLength(arr));
	}
}
