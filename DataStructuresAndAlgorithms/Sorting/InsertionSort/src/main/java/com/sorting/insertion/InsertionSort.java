package com.sorting.insertion;

/**
 * @author shivam.kumar
 * 
 *         InsertionSort Implementation
 */
public class InsertionSort {

	public void sort(int[] arr) {

		for(int i=1; i < arr.length ; i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] arr = {2,3,1,0,89,72,67};
		insertionSort.sort(arr);
		
		for(int i=0 ;i < arr.length ;i++) {
			System.out.println(arr[i]);
		}
	}

}
