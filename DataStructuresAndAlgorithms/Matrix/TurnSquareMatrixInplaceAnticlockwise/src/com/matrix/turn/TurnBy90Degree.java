package com.matrix.turn;

public class TurnBy90Degree {
	public void turn(int[][] matrix) {
		
		int temp;
		for(int i =0;i < matrix.length/2 ; i++) {
			for(int j=i ; j <  matrix.length-i ; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][matrix.length-i-1];
				matrix[j][matrix.length-i-1] = matrix[matrix.length-1-i][matrix.length-j-1];
				matrix[matrix.length-1-j][matrix.length-i-1] = temp;
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
