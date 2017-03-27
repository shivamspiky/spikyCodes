package com.recursion.factorial;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void factTest() {
		Factorial factorial = new Factorial();
		int result=factorial.fact(6);
		int result1=factorial.iterativeFact(6);
		System.out.println(result);
		System.out.println(result1);
	}

}
