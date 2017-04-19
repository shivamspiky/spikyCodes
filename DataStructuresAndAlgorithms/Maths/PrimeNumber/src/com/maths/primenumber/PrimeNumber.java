package com.maths.primenumber;

public class PrimeNumber {
	
	/*A number divisible by something greater than 
	 * its square-root will definately be divisible
	 * by number smaller than its square-root
	 * so that product of these two calculates to n
	 * if still not clear
	 * let's look two equations
	 * one with a equals to product of its square root c * c
	 * and other a equals to product of b (which is greater than c) * k 
	 * then one of number is already greater than c so for product to be equal
	 * k has to be smaller than c so that their product calculates to a*/
	public boolean prime(int n) {
		
		for(int i=2;i*i<=n;i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		System.out.println(primeNumber.prime(97));
	}

}
