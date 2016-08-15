package com.recursion.checksortedarray;

public class RecursionCheckSortedArray {
	
	public boolean isArraySorted(int[] arr,int start ,int end){
		
		if(start==end){
			return true;
		}
		
		if(arr[start] > arr[start+1]){
			return false;
		}
		
		return isArraySorted(arr,start+1,end);
	}

}
