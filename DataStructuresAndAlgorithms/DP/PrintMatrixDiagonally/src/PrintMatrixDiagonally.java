
public class PrintMatrixDiagonally {

	public void print(int[][] matrix) {
		
		for(int i=0;i<matrix.length;i++) {
			int j=0;
			int k=i;
			while(k >=0 && k < matrix.length && j>=0 && j<matrix[0].length) {
				System.out.print(matrix[k][j]+"\t");
				k--;
				j++;
				
			}
			System.out.println();
		}
		
		for(int j=1;j<matrix[0].length;j++) {
			int i=matrix.length-1;
			int k = j;
			while(i >=0 && i < matrix.length && k>=0 && k<matrix[0].length) {
				System.out.print(matrix[i][k]+"\t");
				i--;
				k++;
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = 	{{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15},
							{16,17,18,19,20},
						};
		
		PrintMatrixDiagonally printMatrixDiagonally = new PrintMatrixDiagonally();
		printMatrixDiagonally.print(matrix);
	}
}
