package com.searching.firstrepeatingelement;

import org.junit.Test;

public class FirstRepeatingElementTest {

	@Test
	public void firstRepeatingTest() {

		FirstRepeatingElement firstRepeatingElement = new FirstRepeatingElement();

		int[] arr = { 1, 3, 4, 5, 9, 2 ,5,9,2,5,9,4};
		int result = firstRepeatingElement.firstRepeating(arr);
		System.out.println(result);
	}

}
