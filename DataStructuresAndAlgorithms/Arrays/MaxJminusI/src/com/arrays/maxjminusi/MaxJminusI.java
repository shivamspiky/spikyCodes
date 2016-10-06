package com.arrays.maxjminusi;

public class MaxJminusI {
	public int maxDiff(int[] arr) {

		int[] minArray = new int[arr.length];
		int[] maxArray = new int[arr.length];

		minArray[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<minArray[i-1]){
				minArray[i]=arr[i];
			}else{
				minArray[i]=minArray[i-1];
			}
			
		}
		
		maxArray[0]=arr[arr.length-1];
		for(int i = arr.length-2;i>=0;i--){
			if(arr[i] > maxArray[i+1]){
				maxArray[i]= arr[i];
			}else{
				maxArray[i]=maxArray[i+1];
			}
		}
		int maxdiff = Integer.MIN_VALUE;
		for(int i=0,j=0;i<arr.length && j<arr.length;){
			if(minArray[i] > maxArray[j]) {
				i++;
			}else{
				maxdiff = Math.max(maxdiff, j-i);
				j++;
			}
		}
		
		return maxdiff;
	}
	
	public static void main(String args[]){
		MaxJminusI maxJminusI = new MaxJminusI();
		int[] arr = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
		System.out.println(maxJminusI.maxDiff(arr));
	}
}
