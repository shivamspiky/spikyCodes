package com.dp.squaresubmatrixofall1s;

public class MaximumSizeSquareSubMatrix {
	
	public int maxSizeSquareSubMatrix(int[][] arr){
		
		int[][] utilitySubMatrix = new int[arr.length][arr[0].length];
		int left,top,diagonal,min,max=0;
		for(int i = 0 ;i<arr.length ; i++){
			for(int j=0 ; j< arr[0].length ;j ++){
				
				if(arr[i][j]==1){
					
					top = i-1 < 0 ? 0 : utilitySubMatrix[i-1][j];
					left = j-1 < 0 ? 0 : utilitySubMatrix[i][j-1];
					diagonal = i-1 < 0 || j -1 < 0 ? 0 : utilitySubMatrix[i-1][j-1];
					min = Math.min(top,left);
					min = Math.min(min, diagonal);
					utilitySubMatrix[i][j] = min +1 ;
					if(utilitySubMatrix[i][j] > max){
						max = utilitySubMatrix[i][j];
					}
					 
				}else{
					utilitySubMatrix[i][j] = 0;
				}
			}
		}
		
		return max;
	}

	public static void main(String args[]){
		
		int [][] arr= {{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
		
		MaximumSizeSquareSubMatrix maximumSizeSquareSubMatrix = new MaximumSizeSquareSubMatrix();
		int result = maximumSizeSquareSubMatrix.maxSizeSquareSubMatrix(arr);
		System.out.println(result);
	}
}
