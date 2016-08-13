package com.recursion.factorial;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factTest() {
		Factorial factorial = new Factorial();
		int result=factorial.fact(5);
		System.out.println(result);
	}

}
