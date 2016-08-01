package com.sorting.selection;

import org.junit.Test;

/**
 * @author : shivam kumar
 * 
 *         Juints for SelectionSorting Algorithm.
 */

public class SelectionSortTest {

	@Test
	public void sortTest() {

		int[] arr = { 4, 2, 0, 3, 9, 2, 5, 17, 11, 15, 19, 16 };
		SelectionSort selectionSort = new SelectionSort();
		arr = selectionSort.sort(arr);

		System.out.println("=============Sorted Array=============");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

	@Test
	public void sortTestOneElementArray() {

		int[] arr = { 1 };
		SelectionSort selectionSort = new SelectionSort();
		arr = selectionSort.sort(arr);
		System.out.println("=============Sorted Array=============");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

	@Test
	public void sortTestEmptyArray() {

		int[] arr = {};
		SelectionSort selectionSort = new SelectionSort();
		arr = selectionSort.sort(arr);
		System.out.println("=============Sorted Array=============");
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

}
