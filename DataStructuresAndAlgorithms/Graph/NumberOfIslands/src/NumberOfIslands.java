
public class NumberOfIslands {
	
	public static final int Neighbours=8;
	public int modifiedDFS(int[][] matrix) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		
		int count=0;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				
				if(matrix[i][j]==1 && !visited[i][j]) {
					DFSUtil(matrix,i,j,visited);
					count++;
				}
			}
		}
		
		return count;
	}
	
	private void DFSUtil(int[][] matrix, int x,int y,boolean[][] visited) {
		
		int[] xNeighbour= {0,1,1,1,0,-1,-1,-1};
		int[] yNeighbour= {-1,-1,0,1,1,1,0,-1};
		
		visited[x][y]=true;
		
		for(int i=0;i<Neighbours;i++) {
			
			if(isSafe(visited,matrix,x+xNeighbour[i],y+yNeighbour[i])) {
				DFSUtil(matrix,x+xNeighbour[i],y+yNeighbour[i],visited);
			}
		}
	}
	
	private boolean isSafe(boolean[][] visited,int[][] matrix,int x, int y) {
		
		if(x>=0 && x<matrix.length && y>=0 && y<matrix[0].length && matrix[x][y] ==1 && !visited[x][y]) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1, 1, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 1, 1},
            {0, 0, 0, 0, 0},
            {1, 0, 1, 0, 1}};
		
		NumberOfIslands numberOfIslands = new NumberOfIslands();
		System.out.println(numberOfIslands.modifiedDFS(matrix));
            
            
         
	}
}
