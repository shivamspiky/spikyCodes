import java.util.ArrayList;
import java.util.List;

public class HamiltonianCycle {

	boolean safe(int[][] matrix, List list, int i){
		if(list.contains(i))
			return false;
		return true;
	}
	void print(List list){
		for(int i=0; i< list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public void hamiltonian(int[][] matrix){
		int i=0;
		for(;i < matrix.length;i++){
			List<Integer> list = new ArrayList<Integer>();
			list.add(i);
			if(hamiltonianUtil(matrix, list, i)){
				break;
			}else{
				list.remove(list.size()-1);
			}
			
		}
		if(i==matrix.length)
			System.out.println("No solution exists");
	}
	public boolean hamiltonianUtil(int[][] matrix, List<Integer> list, int lastVisited){
		if(list.size()==matrix.length && matrix[lastVisited][list.get(0)]!=0){
			print(list);
			return true;
		}
		
		for(int i=0;i<matrix.length;i++){
			if(matrix[lastVisited][i] !=0 && safe(matrix,list, i)){
				list.add(i);
				if(hamiltonianUtil(matrix,list,i)){
					return true;
				}
				list.remove(list.size()-1);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		int graph1[][] = {{0, 1, 0, 1, 0},  
                {1, 0, 1, 1, 1},  
                {0, 1, 0, 0, 1},  
                {1, 1, 0, 0, 1},  
                {0, 1, 1, 1, 0}};  
		int graph2[][] = {{0, 1, 0, 1, 0}, 
	            {1, 0, 1, 1, 1}, 
	            {0, 1, 0, 0, 1}, 
	            {1, 1, 0, 0, 0}, 
	            {0, 1, 1, 0, 0}, 
	        };
		
		HamiltonianCycle cycle = new HamiltonianCycle();
		cycle.hamiltonian(graph1);
		cycle.hamiltonian(graph2);
	}
}
