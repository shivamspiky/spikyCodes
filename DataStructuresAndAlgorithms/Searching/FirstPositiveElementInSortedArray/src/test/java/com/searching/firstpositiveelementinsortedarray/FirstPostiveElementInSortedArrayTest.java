package com.searching.firstpositiveelementinsortedarray;

import org.junit.Test;

public class FirstPostiveElementInSortedArrayTest {

	@Test
	public void firstPositiveElementTest() {
		
		FirstPositiveElementInSortedArray firstPositiveElementInSortedArray = new FirstPositiveElementInSortedArray();
		int arr[] = {-3,2,353,988};
		
		int result = firstPositiveElementInSortedArray.firstPositiveElement(arr, 0, arr.length-1);
		System.out.println(result);
	}

}
