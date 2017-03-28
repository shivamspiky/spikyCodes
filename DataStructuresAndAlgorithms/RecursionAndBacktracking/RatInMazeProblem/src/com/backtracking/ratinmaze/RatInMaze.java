package com.backtracking.ratinmaze;

public class RatInMaze {

	public void solveRatInMaze(int[][] maze) {
		boolean[][] sol = new boolean[maze.length][maze[0].length];
		sol[0][0]=true;
		if(solveUtil(sol,maze,0,0)){
			printSol(sol);
		}
	}
	
	private boolean solveUtil(boolean[][] sol, int[][] maze, int currentX,int currentY) {
		
		if(currentX==maze.length-1 && currentY==maze[0].length-1) {
			return true;
		}
		
		if(isSafe(currentX+1,currentY,maze)) {
			sol[currentX+1][currentY]=true;
			if(solveUtil(sol,maze,currentX+1,currentY)) {
				return true;
			}
			sol[currentX+1][currentY]=false;
		}
		
		
		if(isSafe(currentX,currentY+1,maze)) {
			sol[currentX][currentY+1]=true;
			if(solveUtil(sol,maze,currentX,currentY+1)) {
				return true;
			}
			sol[currentX][currentY+1]=false;
		}
		
		
		
		return false;
	}
	
	private void printSol(boolean[][]  sol) {
		for(int i=0;i<sol.length;i++) {
			System.out.println();
			for(int j=0;j<sol[0].length;j++) {
				System.out.print(sol[i][j] + "\t");
			}
		}
	}
 	
	private boolean isSafe(int x, int y, int[][] maze) {
		if(x>=0 && x< maze.length && y >=0 && y <maze[0].length && maze[x][y]==1) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int maze[][] = {{1, 0, 0, 0},
	            {1, 1, 0, 1},
	            {0, 1, 0, 0},
	            {1, 1, 1, 1}
	        };
		
		RatInMaze ratInMaze = new RatInMaze();
		ratInMaze.solveRatInMaze(maze);
	}
}
