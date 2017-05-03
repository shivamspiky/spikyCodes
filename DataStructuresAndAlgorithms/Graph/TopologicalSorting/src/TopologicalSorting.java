import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSorting {
	
	public int v;
	public LinkedList<Integer>[] adjacencyList;
	
	public TopologicalSorting(int v) {
		this.v = v;
		adjacencyList = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adjacencyList[i]= new LinkedList();
		}
	}
	
	public void addEdge(int v, int w) {
		adjacencyList[v].add(w);
	}
	
	public void topSort() {
		int[] indegree = makeIndegreeArray();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0;i<indegree.length;i++) {
			if(indegree[i]==0) {
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int element = queue.remove();
			System.out.print(element + "\t");
			
			int n = adjacencyList[element].size();
			
			for(int i=0;i<n;i++) {
				indegree[adjacencyList[element].get(i)]--;
				
				if(indegree[adjacencyList[element].get(i)]==0) {
					queue.add(adjacencyList[element].get(i));
				}
			}
		}
	}
	
	private int[] makeIndegreeArray() {
		int[] indegree = new int[this.v];
		
		for(int i=0;i<v;i++) {
			int n= adjacencyList[i].size();
			
			for(int j=0;j<n;j++) {
				 indegree[adjacencyList[i].get(j)]++;
			}
		}
		
		return indegree;
	}

	
	
	public static void main(String[] args) {
		
		TopologicalSorting g = new TopologicalSorting(6);
		
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        
        g.topSort();
       
	}
}