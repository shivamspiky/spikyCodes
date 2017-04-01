package com.dp.coinchange;

public class TotalCoinChange {

	public int recursiveCount(int[] S, int m, int n) {
		if(n==0) {
			return 1;
		}
		
		if(n<0) {
			return 0;
		}
		
		if(n>=1 && m<=0) {
			return 0;
		}
		
		return recursiveCount(S,m,n-S[m-1]) + recursiveCount(S,m-1,n);
	}
	
	public int count(int[]S, int m,int n) {
		int[][] countArray= new int[n+1][m+1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				
				if(i==0) {
					countArray[i][j]=1;
				}
				
				else if(j==0) {
					countArray[i][j]=0;
				}
				
				/*check whether any element is eligible to be selected 
				 * or whether any element is smaller than n*/
				else if(i-S[j-1] >=0){  
					countArray[i][j]=countArray[i-S[j-1]][j]+countArray[i][j-1];
				} 
				/*if any element is larger than n itself then we have only
				 * one option count number of ways to make without
				 * including it*/
				else {
					countArray[i][j]=countArray[i][j-1];
				}
			}
		}
		
		return countArray[n][m];
	}
	
	
	
	public static void main(String[] args) {
		int[] S = {1,2,3};
		TotalCoinChange totalCoinChange = new TotalCoinChange();
		
		System.out.println(totalCoinChange.count(S, 3, 4));
	}
}
