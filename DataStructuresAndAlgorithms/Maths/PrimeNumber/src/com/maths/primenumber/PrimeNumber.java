package com.maths.primenumber;

public class PrimeNumber {
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
