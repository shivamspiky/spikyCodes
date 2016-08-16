package com.searching.twoelementsumclosesttozero;

import org.junit.Test;

public class TwoElementSumClosestToZeroTest {

	@Test
	public void closestToZeroTest() {

		TwoElementSumClosestToZero twoElementSumClosestToZero = new TwoElementSumClosestToZero();
		int[] arr = { 1, 60, -10, 70, -80, 85 };
		int res = twoElementSumClosestToZero.closestToZero(arr);
		System.out.println("Sum : " + res);
	}

}
