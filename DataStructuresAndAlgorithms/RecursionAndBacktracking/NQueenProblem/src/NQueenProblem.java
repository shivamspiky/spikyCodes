
public class NQueenProblem {
	
	public void placeQueens(int n) {
		int[][] matrix = new int[n][n];
		placeQueensUtil(matrix, 0);
	}

	private boolean placeQueensUtil(int[][] matrix, int col) {
		if(matrix.length != matrix[0].length) {
			System.out.println("Invalid Chessboard");
		}
		
		if(col==matrix[0].length) {
			print(matrix);
			return true;
		}
		
		for(int i=0;i<matrix.length;i++) {
			
			if(isSafe(matrix,i,col)) {
				matrix[i][col]=1;
				if(placeQueensUtil(matrix,col+1)) {
					return true;
				}
				matrix[i][col]=0;
			}
		}
		
		return false;
	} 
	
	private void print(int[][] matrix) {
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
		NQueenProblem nQueenProblem = new NQueenProblem();
		nQueenProblem.placeQueens(4);
	}
}

