import com.sun.rowset.internal.Row;

public class RowWithMax1 {

	public int findRow(int[][] matrix) {
		
		int index=matrix[0].length-1;
		int row=0;
		
		for(int i=0;i<matrix[0].length;i++) {
			
			if(matrix[0][i]==1) {
				index=i;
				break;
			}
		}
		
		for(int i=1;i<matrix.length&&index!=0;i++) {
			
			for(int j=index-1;j>=0;j--) {
				if(matrix[i][j]!=1) {
					break;
				}else {
					index=j;
					row=i;
				}
			}
		}
		
		return row;
	}
	
	public static void main(String[] args) {
		int matrix[][] = { {0, 0, 0, 1},
		        {0, 1, 1, 1},
		        {1, 1, 1, 1},
		        {0, 0, 0, 0}
		    };
		
		RowWithMax1 rowWithMax1 = new RowWithMax1();
		System.out.println(rowWithMax1.findRow(matrix));
	}
}
