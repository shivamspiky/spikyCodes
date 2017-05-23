package com.matrix.spiral;


public class SpiralPrint {

	public void spiral(int[][] matrix) {
		int rowNum= matrix.length;
		int colNum=matrix[0].length;
		
		int top = 0, bottom = rowNum-1,left = 0, right = colNum-1;
		
		while(top<=bottom && left<=right) {
			
			for(int i=left ;i<=right;i++) {
				System.out.print(matrix[top][i]+" ");
			}
			top++;
			
			for(int i=top ;i<=bottom;i++) {
				System.out.print(matrix[i][right]+" ");
			}
			right--;
			
			if(top<=bottom) {
				
				for(int i=right;i>=left;i--) {
					System.out.print(matrix[bottom][i]+" ");
				}
				bottom--;
			}
			
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(matrix[i][left]+" ");
				}
				left++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		SpiralPrint print = new SpiralPrint();
		int[][] matrix = {
							{1,2,3,11,14},
							{4,5,6,12,15},
							{7,8,9,13,16},
							{71,81,91,113,17}
							};
		
		int[][] matrix1 = {
				{1,2,3,11,14},
				};
		
		int[][] matrix2 = {
				{1},
				{2},
				{3},
				{4}
				};
		
		print.spiral(matrix);
		System.out.println();
		print.spiral(matrix1);
		System.out.println();
		print.spiral(matrix2);
		System.out.println();
		
//		for(int i =0 ; i< matrix.length ;i ++) {
//			System.out.println();
//			for(int j =0 ; j < matrix[0].length ;j++) {
//				System.out.print(matrix[i][j]+"\t");
//			}
//		}
	}

}
