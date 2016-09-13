package com.arrays.checkpairwithsumx;

import java.util.Arrays;

public class CheckPairWithSumX {

	public boolean exists(int arr[],int sum){
		
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		int tempSum;
		while(low <=  high){
			
			tempSum = arr[low] + arr[high];
			if(tempSum == sum){
				return true;
			}
			
			else if(tempSum < sum){
				low ++;
			}else{
				high -- ;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		int arr[] = {1,3,5,9,111,353,0,12};
		CheckPairWithSumX checkPairWithSumX = new CheckPairWithSumX();
		
		System.out.println(checkPairWithSumX.exists(arr, 362));
	}
}
