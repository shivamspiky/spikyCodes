package com.matrix.turn;

public class TurnImageBy90Degree {
	public int[][] turn(int[][] matrix) {
		int[][] resultMatrix = new int[matrix[0].length][matrix.length];
		for(int i=0; i < matrix.length ; i++ ) {
			for(int j=0; j < matrix[0].length ; j++) {
				
				resultMatrix[j][matrix.length-1-i] = matrix[i][j];
			}
		}
		return resultMatrix;
	}
	
	public static void main(String [] args) {
		TurnImageBy90Degree turnImageBy90Degree = new TurnImageBy90Degree();
		int[][] matrix = {
							{1,3,3},
							{2,3,5},
							{4,5,1}
							};
		int[][] result = turnImageBy90Degree.turn(matrix);
		for(int i =0 ;i< result.length ;i ++) {
			System.out.println();
			for(int j = 0 ; j < result[0].length ; j++) {
				System.out.print(result[i][j] + "\t");
			}
		}
	}
}
