package com.arrays.numberwithoddfrequency;

public class NumberWithOddFrequency {

	public int findNumber(int[] arr){
		int num = arr[0];
		for(int i = 1;i < arr.length ;i ++){
			num ^=arr[i];
		}
		
		return num;
	}
	
	public static void main(String args[]){
		
		int[] arr = {1,2,3,3,2,1,3,3,7,7,7};
		
		NumberWithOddFrequency numberWithOddFrequency = new NumberWithOddFrequency();
		System.out.println(numberWithOddFrequency.findNumber(arr));
	}
}
