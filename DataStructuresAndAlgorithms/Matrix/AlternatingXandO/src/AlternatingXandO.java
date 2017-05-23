
public class AlternatingXandO {

	public char[][] getMatrix(int n, int m) {
		
		char[][] matrix = new char[n][m];
		
		int top=0,bottom=n-1,left=0,right=m-1;
		
		char c = 'X';
		
		while(top<=bottom && left <=right) {
			
			for(int i=left;i<=right;i++) {
				matrix[top][i]=c;
			}
			
			top++;
			
			for(int i=top;i<=bottom;i++) {
				matrix[i][right]=c;
			}
			
			right--;
			
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					matrix[bottom][i]=c;
				}
				bottom--;
			}
			
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					matrix[i][left]=c;
				}
				left++;
			}
			
			c=(c=='X')?'0':'X';
		}
		
		return matrix;
	}
	
	public static void main(String[] args) {
		AlternatingXandO alternatingXandO = new AlternatingXandO();
		char[][] matrix = alternatingXandO.getMatrix(4, 5);
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
