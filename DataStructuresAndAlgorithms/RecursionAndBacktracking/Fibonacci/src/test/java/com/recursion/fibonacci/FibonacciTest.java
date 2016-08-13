package com.recursion.fibonacci;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void fiboTest() {
		
		Fibonacci fibonacci = new Fibonacci();
		int result=fibonacci.fibo(7);
		System.out.println(result);
	}

}
