import java.util.LinkedList;

public class Graph {
	int v;
	LinkedList<Integer>[] adj;
	
	public Graph(int v){
		this.v=v;
		this.adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u,int v){
		adj[u].add(v);
		adj[v].add(u);
	}
	
	boolean DFSUtil(int v, boolean[] visited, int par){
		visited[v]=true;
		int n = adj[v].size();
		for(int i=0;i<n;i++){
			int u = adj[v].get(i);
			if(u!=par && visited[u])
				return true;
			if(!visited[u] && DFSUtil(u,visited,v))
				return true;
		}
		return false;
	}
	
	boolean DFS(){
		boolean[] visited = new boolean[this.v];
		for(int i=0;i<this.v;i++){
			if(!visited[i] && DFSUtil(i,visited,-1))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Graph g1 = new Graph(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(2, 1); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        if (g1.DFS()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contain cycle"); 
  
        Graph g2 = new Graph(3); 
        g2.addEdge(0, 1); 
        g2.addEdge(1, 2); 
        if (g2.DFS()) 
            System.out.println("Graph contains cycle"); 
        else
            System.out.println("Graph doesn't contain cycle"); 
	}
}
