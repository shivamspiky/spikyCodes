

public class FloydWarshallAllPairsShortestPathProblem {

	public int[][] shortestRoutes(int[][] Graph) {
		
		int v = Graph.length;
		int[][] sol = new int[v][v];
		
		for(int i=0;i<v;i++) {
			for(int j=0;j<v;j++) {
				sol[i][j] = Graph[i][j];
			}
		}
		for(int k=0;k<v;k++) {
			
			for(int i=0;i<v;i++) {
				for(int j=0;j<v;j++) {
					if(sol[i][k] + sol[k][j] < sol[i][j]) {
						sol[i][j] = sol[i][k] + sol[k][j];
					}
				}
			}
		}
		
		return sol;
	}
	
	public static void print(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==9999999) {
					System.out.print("INF" + "\t");
				}else {
					System.out.print(matrix[i][j] + "\t");
				}
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		FloydWarshallAllPairsShortestPathProblem floydWarshallAllPairsShortestPathProblem = new FloydWarshallAllPairsShortestPathProblem();
		int [][] Graph = {
				 {0,   5,  9999999, 10},
                    {9999999,  0,  3,  9999999},
                    {9999999, 9999999, 0,   1},
                    {9999999, 9999999, 9999999, 0} 
				
				
		};
		int[][] sol = floydWarshallAllPairsShortestPathProblem.shortestRoutes(Graph);
		print(sol);
		
	}
}
