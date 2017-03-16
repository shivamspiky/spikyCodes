package com.dp.mincostpath;

public class MinCostPath {

	public int minCost(int[][] cost, int m, int n) {

		int[][] totalCost = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 && j == 0) {
					totalCost[i][j] = cost[i][j];
				} else if (i == 0) {
					totalCost[i][j] = cost[i][j] + totalCost[i][j - 1];
				} else if (j == 0) {
					totalCost[i][j] = cost[i][j] = totalCost[i - 1][j];
				} else {
					totalCost[i][j] = cost[i][j]
							+ min(totalCost[i - 1][j], totalCost[i - 1][j - 1],
									totalCost[i][j - 1]);
				}
			}
		}
		return totalCost[m][n];
	}

	private int min(int a, int b, int c) {
		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		return min;
	}
	
	public static void main(String[] args) {
		MinCostPath minCostPath = new MinCostPath();
		
		int[][] cost = { {1, 2, 3},
                {4, 8, 2},
                {1, 5, 3} };
		
		System.out.println(minCostPath.minCost(cost, 2, 2));
	}
}
