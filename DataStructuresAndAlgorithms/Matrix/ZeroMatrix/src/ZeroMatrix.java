
public class ZeroMatrix {
	
	/*first method*/
	public void	zeroMatrix1(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		boolean[] rowBits = new boolean[row];
		boolean[] colBits = new boolean[col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				if(matrix[i][j]==0) {
					rowBits[i]=true;
					colBits[j]=true;
				}
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++) {
				if(rowBits[i] || colBits[j]) {
					matrix[i][j]=0;
				}
			}
		}
	} 
	
	/*second method*/
	
	public void zeroMatrix2(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		boolean rowBit = false;
		boolean colBit = false;
		for(int i=0;i<col ;i++) {
			if(matrix[0][i] == 0) {
				rowBit = true;
				break;
			}
		}
		
		for(int i=0;i<row ;i++) {
			if(matrix[i][0] == 0) {
				colBit = true;
				break;
			}
		}
		
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				if(matrix[i][j]==0) {
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		
		
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				if(matrix[0][j]==0 || matrix[i][0] ==0) {
					matrix[i][j]=0;
				}
			}
		}
		
		if(rowBit) {
			for(int i=0;i<col;i++) {
				matrix[0][i] =0;
			}
		}
		
		if(colBit) {
			for(int i=0;i<row ;i++) {
				matrix[i][0] =0;
			}
		}
		
	}
	
	public static void main(String[] args){
		ZeroMatrix zeroMatrix = new ZeroMatrix();
		int[][] matrix = {
				{1,0,3,4},
				{4,3,6,5},
				{7,8,0,5},
				{1,3,5,5}
		};
		
		zeroMatrix.zeroMatrix2(matrix);
		
		for(int i=0;i<matrix.length;i++) {
			System.out.println();
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		}
	}
	
	
}
