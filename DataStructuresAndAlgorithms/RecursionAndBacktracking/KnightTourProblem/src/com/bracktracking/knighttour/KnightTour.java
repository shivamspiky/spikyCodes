package com.bracktracking.knighttour;

public class KnightTour {

	public static final int N = 8;
	
	int[][] chess = new int[N][N];
	int xMoves[] = {2,1,-1,-2,-2,-1,1,2};
    int yMoves[] = {1,2,2,1,-1,-2,-2,-1,};
	
	public void solveKT() {
		chess[0][0]=1;
		if(solveKTUtil(2,0,0)) {
			printChess();
		} else {
			System.out.println("No such tour exists");
		}
		
	}
	
	private boolean solveKTUtil(int nextMove, int currentX, int currentY) {
		System.out.println(nextMove);
		if(nextMove==N*N+1) {
			return true;
		}
		for(int i=0;i<N;i++) {
			
			if(isNextSafe(currentX+xMoves[i],currentY+yMoves[i],chess)) {
				chess[currentX+xMoves[i]][currentY+yMoves[i]]=nextMove;
				
				if(solveKTUtil(nextMove+1,currentX+xMoves[i],currentY+yMoves[i])) {
					return true;
				}
				chess[currentX+xMoves[i]][currentY+yMoves[i]]=0;
			}
			
		}
		
		return false;
	}
	
	private boolean isNextSafe(int x, int y, int[][] chess) {
		if(x>=0 && x<N && y>=0 && y<N && chess[x][y]==0) {
			return true;
		}
		return false;
	}
	
	private void printChess() {
		
		for(int i=0;i<chess.length;i++) {
			System.out.println();
			for(int j=0;j<chess[0].length;j++) {
				System.out.print(chess[i][j] + "\t");
			}
		}
	}
	
	public static void main(String[] args) {
		KnightTour knightTour = new KnightTour();
		knightTour.solveKT();
	}
}
