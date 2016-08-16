package com.searching.missingnumber;


public class MissingNumber {
	
	public int missingNumberThroughXOR(int[] arr){
		
		int i;
		int missingNumber=0;
		
		for(i = 0;i < arr.length ;i++){
			missingNumber ^=arr[i];
		}
		
		for(i=1 ;i < arr.length+2 ;i ++){
			missingNumber ^=i;
		}
		
		return missingNumber;
	}
	
	public int missingNumberThroughMath(int[] arr){
		
		int sum;
		sum =  ((arr.length+1)*(arr.length+2))/2;
		
		for(int i=0;i < arr.length ;i ++){
			sum -=arr[i];
		}
		
		return sum;
		
	}

}
