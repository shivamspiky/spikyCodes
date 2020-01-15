import java.util.LinkedList;

public class Graph {
	int V;
	LinkedList<Integer>[] adj;
	
	Graph(int v){
		this.V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u, int v){
		adj[u].add(v);
	}
	
	int countPaths(int u, int v, boolean[] visited){
		if( u == v )
			return 1;
		visited[u]=true;
		int ans = 0;
		int n = this.adj[u].size();
		for(int i=0;i<n ;i++){
			if( !visited[adj[u].get(i)] )
				ans+=countPaths(adj[u].get(i),v,visited);
		}
		visited[u] = false;
		return ans;	
	}

	public static void main(String[] args){
		Graph g = new Graph(4); 
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(2, 0); 
        g.addEdge(2, 1); 
        g.addEdge(1, 3); 
  
        int s = 2, d = 3;
        boolean[] visited = new boolean[g.V];
        System.out.println(g.countPaths(s, d,visited)); 
	}
}
