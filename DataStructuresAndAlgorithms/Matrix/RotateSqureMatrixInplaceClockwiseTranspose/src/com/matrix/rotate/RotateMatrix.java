package com.matrix.rotate;


public class RotateMatrix {

	public void rotate (int[][] matrix) {
		
		int n = matrix[0].length;
		// take inplace transpose of matrix
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		// reverse every row of matrix
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n/2;j++) {
				int temp = matrix[i][j];
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=temp;
			}
		}
		
	} 
	
	public static void main(String[] args) {
		RotateMatrix rotate = new RotateMatrix();
		int[][] matrix = {
							{1,2,3,11},
							{4,5,6,12},
							{7,8,9,13},
							{71,81,91,113}
							};
		
		rotate.rotate(matrix);
		
		for(int i =0 ; i< matrix.length ;i ++) {
			System.out.println();
			for(int j =0 ; j < matrix[0].length ;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
		}
	}
}
