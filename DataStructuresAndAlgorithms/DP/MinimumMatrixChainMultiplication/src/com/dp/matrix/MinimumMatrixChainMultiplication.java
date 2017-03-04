package com.dp.matrix;

public class MinimumMatrixChainMultiplication {
	
	public int minimumMultiplications(int[] P) {
		int n = P.length;
		int [][] M = new int[n][n];
		int [][] S = new int[n][n];
		
		for(int l=2;l<=n-1;l++) {
			for(int i=1;i<=n-l;i++) {
				int j=i+l-1;
				M[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++) {
					int temp = M[i][k]+M[k+1][j]+P[i-1]*P[k]*P[j];
					if(temp < M[i][j]) {
						M[i][j]=temp;
						S[i][j]=k;
					}
				}
			}
		}
		
		printParenthesis(S,1,P.length-1);
		System.out.println();
		return M[1][P.length-1];
	}
	
	private void printParenthesis(int[][] S, int i, int j) {
		if(i==j) {
			
			System.out.print(i);
			return ;
		}
		
		System.out.print("(");
		int k = S[i][j];
		printParenthesis(S,i,k);
		printParenthesis(S,k+1,j);
		System.out.print(")");
	}
	
	public static void main(String[] args) {
		MinimumMatrixChainMultiplication matrix = new MinimumMatrixChainMultiplication();
		int[] P = {40, 20, 30, 10, 30};
		System.out.println(matrix.minimumMultiplications(P));
	}

}
