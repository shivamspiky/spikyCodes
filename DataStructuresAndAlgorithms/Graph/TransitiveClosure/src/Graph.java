import java.util.LinkedList;

public class Graph {
	int V;
	LinkedList<Integer>[] adj;
	
	
	Graph(int v){
		this.V=v;
		adj = new LinkedList[this.V];
		for(int i=0;i<this.V;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u, int v){
		this.adj[u].add(v);
	}
	
	void DFSUtil(boolean[][] tClos, int s, int v){
		tClos[s][v]=true;
		int n= this.adj[v].size();
		for(int i=0;i<n;i++){
			if(!tClos[s][adj[v].get(i)])
				DFSUtil(tClos,s,adj[v].get(i));
		}
	}
	
	void transitiveClosure(){
		boolean[][] tClos = new boolean[this.V][this.V];
		for(int i=0;i<this.V;i++){
			DFSUtil(tClos,i,i);
		}
		
		for(int i=0;i<this.V;i++){
			for(int j=0;j<this.V;j++){
				System.out.print(tClos[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		Graph g = new Graph(7); 
	    g.addEdge(0, 1); 
	    g.addEdge(0, 2); 
	    g.addEdge(1, 3); 
	    g.addEdge(4, 1); 
	    g.addEdge(6, 4); 
	    g.addEdge(6, 5); 
	    g.addEdge(5, 2); 
	    g.addEdge(6, 0); 
	    g.transitiveClosure();
	}
}
