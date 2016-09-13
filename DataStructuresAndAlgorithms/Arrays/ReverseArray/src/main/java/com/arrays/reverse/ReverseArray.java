package com.arrays.reverse;

public class ReverseArray {
	
	public void reverse(int[] arr){
		
		
		for(int start = 0, end = arr.length -1 ;start < end ; start ++, end --){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
		}
	}
	
	public static void main(String args[]){
		
		int arr[] = {1,3,7,8,2,7,3};
		ReverseArray reverseArray = new ReverseArray();
		
		reverseArray.reverse(arr);
		
		for(int i =0;i< arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		
	}

}
