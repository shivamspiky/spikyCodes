import java.util.LinkedList;

public class Graph {
	int v;
	LinkedList<Integer>[] adj;
	
	public Graph(int v){
		this.v=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u, int v){
		adj[u].add(v);
	}
	
	boolean DFSUtil(int v, boolean[] visited, boolean[] recStack){
		
		recStack[v]=true;
		visited[v]=true;
		int n = adj[v].size();
	
		for(int i=0;i<n;i++){
			if(recStack[adj[v].get(i)])
				return true;
			if(!visited[adj[v].get(i)] && DFSUtil(adj[v].get(i),visited,recStack))
				return true;
		}
		recStack[v]=false;
		return false;
	}
	
	boolean DFS(){
		boolean[] visited = new boolean[this.v];
		boolean[] recStack = new boolean[this.v];
		
		for(int i=0;i<this.v;i++){
			if(!visited[i] && DFSUtil(i,visited,recStack))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Graph graph = new Graph(4); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 2); 
        graph.addEdge(1, 2); 
        graph.addEdge(2, 0); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 3); 
        
        if(graph.DFS()){
        	System.out.println("Graph has cycle");
        }else{
        	System.out.println("Graph doesn't have cycle");
        }
	}
	
	
}
