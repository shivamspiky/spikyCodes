package com.searching.twoelementsum;

import org.junit.Test;

import com.searching.twoelementsumequalsk.TwoElementSumEqualsK;

public class TwoElementSumEqualsKTest {

	@Test
	public void twoElementSumTest() {

		int[] arr = { 1, 3, 55, 23, 83, 133, 233432 };

		TwoElementSumEqualsK twoElementSumEqualsK = new TwoElementSumEqualsK();
		twoElementSumEqualsK.twoElementSum(arr, 136);
	}

}
