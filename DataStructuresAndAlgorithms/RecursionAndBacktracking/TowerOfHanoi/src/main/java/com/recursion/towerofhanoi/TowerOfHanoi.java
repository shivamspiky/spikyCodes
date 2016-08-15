package com.recursion.towerofhanoi;

public class TowerOfHanoi {

	public void towerOfHanoi(int n, String from,String to, String aux){
		
		if(n==1){
			System.out.println("Move disk 1 from Peg " + from + " to "+ to );
			return ;
		}
		
		towerOfHanoi(n-1,from,aux,to);
		
		System.out.println("Move disk " + n + " from Peg" + from + "to" + to);
		
		towerOfHanoi(n-1,aux,to,from);
		
	}
}
