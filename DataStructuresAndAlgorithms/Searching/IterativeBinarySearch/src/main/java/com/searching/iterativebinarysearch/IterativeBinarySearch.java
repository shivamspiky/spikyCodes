package com.searching.iterativebinarysearch;

public class IterativeBinarySearch {
	
	public int binarySearch(int[] arr, int key){
		
		int mid;
		int start = 0;
		int end = arr.length-1;
		while(start <= end){
			
			mid=start+(end-start)/2;
			
			if(arr[mid]==key){
				return mid;
			}
			
			else if(arr[mid] < key){
				start = mid+1;
				
			}
			
			else{
				end = mid -1 ;
			}
		}
		
		return -1;
	}
	
	public int recursiveBinarySearch(int[] arr,int start, int end,int key) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = start + (end-start)/2;
		
		if(arr[mid]==key) {
			return mid;
		}
		else if(arr[mid] < key) {
			return recursiveBinarySearch(arr,mid+1,end,key);
		} else {
			return recursiveBinarySearch(arr,start,mid-1,key);
		}
	}

}
