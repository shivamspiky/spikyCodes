package com.matrix.rotation;


public class RotateMatrix {

	public void rotate(int[][] matrix) {
		
		int n = matrix[0].length;
		
		for(int i=0;i<n/2;i++) {
			
			for(int j=i;j<n-1-i;j++) {
				
				int temp = matrix[i][j];
				matrix[i][j]=matrix[n-1-j][i];
				matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
				matrix[j][n-1-i]=temp;
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
