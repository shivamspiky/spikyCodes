package com.sorting.bubble;

import org.junit.Test;

/**
 * @author : shivam kumar
 * 
 *         Juints for BubbleSort Algorithm.
 */

public class BubbleSortTest {

	@Test
	public void sortTest() {

		int[] arr = { 4, 2, 0, 3, 9, 2, 5, 17, 11, 15, 19, 16 };
		BubbleSort bubbleSort = new BubbleSort();
		arr = bubbleSort.sort(arr);

		System.out.println("=============Sorted Array=============");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

	@Test
	public void sortTestOneElementArray() {

		int[] arr = { 1 };
		BubbleSort bubbleSort = new BubbleSort();
		arr = bubbleSort.sort(arr);
		System.out.println("=============Sorted Array=============");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

	@Test
	public void sortTestEmptyArray() {

		int[] arr = {};
		BubbleSort bubbleSort = new BubbleSort();
		arr = bubbleSort.sort(arr);
		System.out.println("=============Sorted Array=============");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

}
