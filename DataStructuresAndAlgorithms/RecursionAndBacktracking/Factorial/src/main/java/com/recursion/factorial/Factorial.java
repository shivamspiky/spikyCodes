package com.recursion.factorial;

public class Factorial {

	public int fact(int n){
		
		if(n==0 || n==1){
			return 1;
		}
		
		return n*fact(n-1);
	}
	
	public int iterativeFact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact = fact * i;
		}
		
		return fact;
	}
}
