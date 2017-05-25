public class AllSubSquaresWithSizeK {

	public int[][] getMatrix(int[][] matrix, int k) {
		
		if(matrix.length!=matrix[0].length) {
			return null;
		}
		int n = matrix.length;
		int[][] verStripMatrix = new int[n-k+1][n];
		int[][] outputMatrix  = new int[n-k+1][n-k+1];
		for(int i=0;i<n;i++) {
			
			int sum =0;
			
			for(int j=0;j<k;j++) {
				sum+=matrix[j][i];
			}
			
			for(int j=0;j<n-k+1;j++) {
				verStripMatrix[j][i]=sum;
				sum-=matrix[j][i];
				if(j<n-k) {
					sum+=matrix[j+k][i];
				}
			}
		}
		//print(verStripMatrix);
		for(int i=0;i<n-k+1;i++) {
			int sum =0;
			for(int j=0;j<k;j++) {
				sum+=verStripMatrix[i][j];
			}
			
			for(int j=0;j<n-k+1;j++) {
				outputMatrix[i][j]=sum;
				sum-=verStripMatrix[i][j];
				if(j<n-k) {
					sum+=verStripMatrix[i][j+k];
				}
			}
		}
		
		return outputMatrix;
	}
	
	public static void print(int[][] matrix) {
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		AllSubSquaresWithSizeK allSubSquaresWithSizeK = new AllSubSquaresWithSizeK();
		
		int[][] matrix1 = { {1, 1, 1, 1, 1},
	            {2, 2, 2, 2, 2},
	            {3, 3, 3, 3, 3},
	            {4, 4, 4, 4, 4},
	            {5, 5, 5, 5, 5},
	         };
		
		int[][] matrix2 = { {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9},
	         };
		
		int[][] output1 = allSubSquaresWithSizeK.getMatrix(matrix1, 3);
		int[][] output2 = allSubSquaresWithSizeK.getMatrix(matrix2, 2);
		
		print(output1);
		System.out.println();
		print(output2);
		
	}
}
