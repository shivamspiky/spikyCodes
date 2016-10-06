package com.arrays.consecutiveelements;

import java.io.UnsupportedEncodingException;

public class CheckArrayElementsAreConsecutive {

	public boolean check(int[] arr){
		/*Step 1. n = max-min+1*/
		/*Step 2. All elements are distinct (negate method)*/
		
		int i,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(i=0;i< arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		if(max-min+1 != arr.length){
			return false;
		}
		
		for(i=0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])-min] < 0){
				return false;
			}
			if(arr[Math.abs(arr[i])-min] > 0){
				arr[Math.abs(arr[i])-min]= -arr[Math.abs(arr[i])-min]; 
			}
		}
		return true;
	}
	
	public static void main(String args[]) throws UnsupportedEncodingException{
		int[] arr = {83, 78, 80, 81, 79, 82};
	//	System.out.println(java.net.URLEncoder.encode("Hello World", "UTF-8"));
		CheckArrayElementsAreConsecutive checkArrayElementsAreConsecutive = new CheckArrayElementsAreConsecutive();
		System.out.println(checkArrayElementsAreConsecutive.check(arr));
	}
}
