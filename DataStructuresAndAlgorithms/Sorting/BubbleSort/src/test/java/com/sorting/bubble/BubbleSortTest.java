package com.sorting.bubble;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void sorttest() {
		
		
		int[] arr = {4,2,0,3,9,2,5,17,11,15,19,16};
		BubbleSort bubbleSort=new BubbleSort();
		arr=bubbleSort.sort(arr);
		
		System.out.println("=============Sorted Array=============");
		for(int i=0; i<arr.length;i++){
			
			System.out.println(arr[i] + " ");
		}
	}
	
	@Test
	public void sorttestOneElementArray() {
		
		
		int[] arr = {1};
		BubbleSort bubbleSort=new BubbleSort();
		arr=bubbleSort.sort(arr);
		System.out.println("=============Sorted Array=============");
		for(int i=0; i<arr.length;i++){
			
			System.out.println(arr[i] + " ");
		}
	}
	
	@Test
	public void sorttestEmptyArray() {
		
		
		int[] arr = {};
		BubbleSort bubbleSort=new BubbleSort();
		arr=bubbleSort.sort(arr);
		System.out.println("=============Sorted Array=============");
		for(int i=0; i<arr.length;i++){
			
			System.out.println(arr[i] + " ");
		}
	}

}
