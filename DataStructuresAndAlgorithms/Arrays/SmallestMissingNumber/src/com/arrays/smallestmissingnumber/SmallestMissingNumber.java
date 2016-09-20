package com.arrays.smallestmissingnumber;

public class SmallestMissingNumber {
	public int smallest(int[] arr){
		int start = 0;
		int end = arr.length -1;
		while(start <= end){
			if(start!=arr[start]){
				return start;
			}
			int mid = start + (end-start)/2;
			if(arr[mid] > mid){
				end = mid -1;
			}else{
				start = mid +1;
			}
		}
		return end+1;
	}
	
	public static void main(String args[]){
		int arr[]= new int[]{0,1,2,3,5,6};
		SmallestMissingNumber smallestMissingNumber = new SmallestMissingNumber();
		int result = smallestMissingNumber.smallest(arr);
		System.out.println(result);
	}
}
