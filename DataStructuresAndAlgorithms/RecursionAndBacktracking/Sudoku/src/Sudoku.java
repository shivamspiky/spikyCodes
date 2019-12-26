
public class Sudoku {
	int subGridSize = 3;
	
	void print(int[][] grid){
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid.length;j++){
				System.out.print(grid[i][j] + "\t" );
			}
			System.out.println();
		}
			
	}
	
	boolean safe(int[][] grid, int x, int y, int digit){
		//check the row
		for(int i=0;i<grid.length;i++){
			if(grid[x][i] == digit)
				return false;
		}
		//check the column
		for(int i=0;i<grid.length;i++){
			if(grid[i][y] == digit)
				return false;
		}
		//check the subgrid
		x = (x/3)*3;
		y= (y/3)*3;
		for(int i=x;i<x + 3;i++){
			for(int j=y;j< y + 3;j++){
				if(grid[i][j]==digit)
					return false;
			}
		}
		return true;
		
	}
	
	boolean sudokuUtil(int[][] grid, int x, int y){
		if(y==grid.length){
			y=0;
			x++;
		}
		if(x==grid.length){
			return true;
		}
		if(grid[x][y]!=0)
			return sudokuUtil(grid,x,y+1);
		
		for(int k=1;k<=9;k++){
			if(safe(grid,x,y,k)){
				grid[x][y]=k;
				if(sudokuUtil(grid,x,y+1))
					return true;
				grid[x][y]=0;
			}			
		}
		return false;
	}
	public void sudoku(int[][] grid){
		if(!sudokuUtil(grid,0,0))
			System.out.println("No Solution Exists");
		else
			print(grid);
	}
	
	public static void main(String[] args){
		int[][] board = new int[][] 
			    { 
			            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
			            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
			            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
			            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
			            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
			            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
			            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
			            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
			            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
			    }; 
			    
			    Sudoku sudoku = new Sudoku();
			    sudoku.sudoku(board);
	}
}
