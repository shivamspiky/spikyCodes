package com.arrays.maxsumwithnotwoelementsadjacent;

public class MaxSumWithNoTwoElementsAdjacent {
	
	public int maxSum(int[] arr){
		
		if(arr.length==1){
			return arr[0];
		}
		if(arr.length==2){
			return Math.max(arr[0], arr[1]);
		}
		int a= arr[0];
		int b = arr[1];
		for(int i=2;i<arr.length;i++){
			if(i%2==0){
				if(a+arr[i] > a){
					a= a+arr[i];
				}else{
					a= Math.max(a,b);
				}
			}else{
				if(b+arr[i] > b){
					b= b+arr[i];
				}else{
					b= Math.max(a,b);
				}
			}
		}
		return Math.max(a,b);
	}
	
	public int maxSumOptimised(int[] arr) {
		
		if(arr.length==1) {
			return arr[0];
		}
		if(arr.length==2) {
			return Math.max(arr[0],arr[1]);
		}
		int prev1=Math.max(arr[0],arr[1]), prev2=arr[0];
		int maxSum=0;
		for(int i=2;i<arr.length;i++) {
			maxSum = Math.max(prev1,prev2+arr[i]);
			prev1=maxSum;
			prev2 = prev1;
		}
		
		return maxSum;
	}
	
	public static void main(String args[]){
		int arr[] = {-1,2,-3,-4,6,-7,8,-3,-9,-11};
		MaxSumWithNoTwoElementsAdjacent maxSumWithNoTwoElementsAdjacent = new MaxSumWithNoTwoElementsAdjacent();
		int result1 = maxSumWithNoTwoElementsAdjacent.maxSum(arr);
		int result = maxSumWithNoTwoElementsAdjacent.maxSumOptimised(arr);
		System.out.println(result+ " " + result1);
	}
}
