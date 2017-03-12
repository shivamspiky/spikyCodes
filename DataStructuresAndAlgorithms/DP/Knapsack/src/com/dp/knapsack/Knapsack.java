package com.dp.knapsack;

public class Knapsack {
	
	public int knapsack(int[] values, int[] weight, int C) {
		
		if(C<0) {
			return 0;
		}
		
		int[][] M = new int[values.length+1][C+1];
		for(int i=1;i<=values.length;i++) {
			
			for(int j=1;j<=C;j++) {
				
				if(j-weight[i-1]>=0) {
					M[i][j]=Math.max(M[i-1][j],values[i-1]+M[i-1][j-weight[i-1]]);
				}
				else {
					M[i][j] = M[i-1][j];
				}
			}
		}
		
		return M[values.length][C];
	}
	
	public static void main(String[] args) {
		Knapsack knapSack = new Knapsack();
		
		int[] values = {60, 100, 120};;
		int[] weight = {10, 20, 30};
		
		int optimal = knapSack.knapsack(values, weight, 50);
		
		System.out.println(optimal);
	}

}
