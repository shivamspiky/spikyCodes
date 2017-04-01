package com.dp.binomialcoefficient;

public class BinomialCoefficient {

	public int recFindBinomialCoefficient(int n, int k) {
		if(k==0||k==n) {
			return 1;
		}
		
		return recFindBinomialCoefficient(n-1,k-1) + recFindBinomialCoefficient(n-1,k);
	}
	
	public int findBinomialCoefficient(int n, int k) {
		
		int [][] coefficients = new int[n+1][k+1];
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=k;j++) {
				if(j==0 || j==i) {
					coefficients[i][j]=1;
				} else {
					coefficients[i][j]=coefficients[i-1][j-1]+coefficients[i-1][j];
				}
			}
		}
		
		return coefficients[n][k];
	}
	
	/*better solution through maths as we can find n! and k! and n-k! and
	 * then n!/k!*(n-1)!  complexity in this case is O(n)*/
	
	public static void main(String[] args) {
		BinomialCoefficient binomialCoefficient = new BinomialCoefficient();
		System.out.println(binomialCoefficient.findBinomialCoefficient(6, 4));
	}
}
