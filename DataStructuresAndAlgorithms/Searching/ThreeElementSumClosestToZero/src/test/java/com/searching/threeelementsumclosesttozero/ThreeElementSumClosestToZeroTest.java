package com.searching.threeelementsumclosesttozero;

import org.junit.Test;

public class ThreeElementSumClosestToZeroTest {

	@Test
	public void threeElementSumTest() {
		
		ThreeElementSumClosestToZero threeElementSumClosestToZero = new ThreeElementSumClosestToZero();
		
		int arr[] = {1,3,35,35,-3,225,-53,223,-2};
		
		threeElementSumClosestToZero.threeElementSum(arr);
	}

}
