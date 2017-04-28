
public class MatrixMultiplication {

	public int[][] multiply(int[][] matrix1, int[][] matrix2) {
		
		if(matrix1==null || matrix2==null) {
			return null;
		}
		int row1=matrix1.length;
		int col1=matrix1[0].length;
		int row2=matrix2.length;
		int col2=matrix2[0].length;
		
		if(col1!=row2) {
			System.out.println("Input matrices are not compatible for multiplication");
			return null;
		}
		
		int[][] result = new int[row1][col2];
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				int temp =0;
				for(int k=0;k<col1;k++) {
					temp+=matrix1[i][k]*matrix2[k][j];
					
				}
				result[i][j]=temp;
			}
		}
		
		return result;
	
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {
				{1,2,3},
				{4,5,6}
				
				
		};
		
		int[][] matrix2 = {
				{9},
				{8},
				{7}
		};
		
		MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
		int[][] result = matrixMultiplication.multiply(matrix1, matrix2);
		
		for(int i=0;i < result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
