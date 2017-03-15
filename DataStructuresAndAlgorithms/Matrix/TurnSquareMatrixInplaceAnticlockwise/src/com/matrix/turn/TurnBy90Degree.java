package com.matrix.turn;

public class TurnBy90Degree {
	public void turn(int[][] matrix) {
		
		int temp;
		int n = matrix[0].length;
		for(int i =0;i < n/2 ; i++) {
			for(int j=i ; j <  n-1-i ; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][n-1-i];
				matrix[n-1-j][n-1-i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j]= matrix[n-1-j][i];
				matrix[n-1-j][i]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		TurnBy90Degree turnBy90Degree = new TurnBy90Degree();
		int[][] matrix = {
							{1,2,3},
							{4,5,6},
							{7,8,9}
							};
		
		turnBy90Degree.turn(matrix);
		
		for(int i =0 ; i< matrix.length ;i ++) {
			System.out.println();
			for(int j =0 ; j < matrix[0].length ;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
		}
	}
}
