package com.matrix.spiral;


public class SpiralPrint {

	public void spiral(int[][] matrix,int m,int n) {
		
		int i=0,j=m-1,k=0,l=n-1,dir=0;
		
		while(i<=j&& k<=l) {
			
			if(dir==0) {
				for(int p=k;p<=l;p++) {
					System.out.print(" "+matrix[i][p]);
				}
				
				i++;
				dir=1;
			}
			
			if(dir==1) {
				for(int p=i;p<=j;p++) {
					System.out.print(" "+matrix[p][l]);
				}
				
				l--;
				dir=2;
			}
			
			if(dir==2) {
				for(int p=l;p>=k;p--) {
					System.out.print(" "+matrix[j][p]);
				}
				
				j--;
				dir=3;
			}
			
			if(dir==3) {
				
				for(int p=j;p>=i;p--) {
					System.out.print(" " + matrix[p][k]);
				}
				
				k++;
				dir=0;
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
		
		print.spiral(matrix, 4, 5);
		
//		for(int i =0 ; i< matrix.length ;i ++) {
//			System.out.println();
//			for(int j =0 ; j < matrix[0].length ;j++) {
//				System.out.print(matrix[i][j]+"\t");
//			}
//		}
	}

}
