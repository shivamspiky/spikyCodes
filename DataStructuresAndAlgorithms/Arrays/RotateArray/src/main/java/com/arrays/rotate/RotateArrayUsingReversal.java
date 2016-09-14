package com.arrays.rotate;

public class RotateArrayUsingReversal {

	public void rotate(int arr[], int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
	}

	private void reverse(int arr[], int start, int end) {
		for (; start < end; start++, end--) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp; 
		}
	}
	
	public static void main(String args[]){
		int [] arr = {1,2,3,4,5,6,7,8,9};
		RotateArrayUsingReversal rotateArrayUsingReversal = new RotateArrayUsingReversal();
		rotateArrayUsingReversal.rotate(arr, 4);
		for(int i =0 ;i<arr.length ;i ++){
			System.out.print(arr[i]+" ");
		}
	}
}
