
public class AllNQueenProblemSolutions {
	int count=0;
	public void placeQueens(int n) {
		int[][] matrix = new int[n][n]; //  choose boolean instead of int matrix
		placeQueensUtil(matrix, 0); 
		if(count==0) {
			System.out.println("Solution doesn't exist");
		}
	}

	private void placeQueensUtil(int[][] matrix, int col) {
		if(matrix.length != matrix[0].length) {
			System.out.println("Invalid Chessboard");
		}
		
		if(col==matrix[0].length) {
			print(matrix);
			
		}
		
		for(int i=0;i<matrix.length;i++) {
			
			if(isSafe(matrix,i,col)) {
				matrix[i][col]=1;
				placeQueensUtil(matrix,col+1);
				matrix[i][col]=0;
			}
		}
	} 
	
	private void print(int[][] matrix) {
		count++;
		System.out.println("Solution #" +count);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length ;j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			
			System.out.println();
		}
	}
	
	private boolean isSafe(int[][] matrix,int row, int col) {
		
		for(int j=col-1;j>=0;j--) {
			if(matrix[row][j]==1) {
				return false;
			}
		}
		
		for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--) {
			if(matrix[i][j]==1) {
				return false;
			}
		}
		
		for(int i=row+1,j=col-1;i<matrix.length && j>=0;i++,j--) {
			if(matrix[i][j]==1) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		AllNQueenProblemSolutions nQueenProblem = new AllNQueenProblemSolutions();
		nQueenProblem.placeQueens(8);
	}
}

