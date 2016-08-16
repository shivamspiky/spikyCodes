package com.searching.missingnumber;

import org.junit.Test;

public class MissingNumberTest {

	@Test
	public void missingNumberThroughXORTest() {

		MissingNumber missingNumber = new MissingNumber();
		int[] arr = { 1, 3, 2, 4, 5, 6, 8 };
		int result = missingNumber.missingNumberThroughXOR(arr);
		System.out.println(result);
	}

	@Test
	public void missingNumberThroughMathTest() {

		MissingNumber missingNumber = new MissingNumber();
		int[] arr = { 1, 3, 2, 4, 5, 6, 8 };
		int result = missingNumber.missingNumberThroughMath(arr);
		System.out.println(result);
	}

}
