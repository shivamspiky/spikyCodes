import java.util.LinkedList;

public class Graph {
	int v;
	LinkedList<Integer>[] adj;
	
	Graph(int v){
		this.v=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int u, int v){
		adj[u].add(v);
		adj[v].add(u);
	}
	
	void DFSUtil(int u, boolean[] visited){
		int n = adj[u].size();
		for(int i=0;i<n;i++){
			if(!visited[adj[u].get(i)]){
				visited[adj[u].get(i)]=true;
				DFSUtil(adj[u].get(i), visited);
			}
		}
	}
	
	int DFS(){
		boolean[] visited = new boolean[this.v];
		int count=0;
		for(int i=0;i<this.v;i++){
			if(!visited[i]){
				count++;
				DFSUtil(i, visited);
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		Graph g = new Graph(8);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(6, 7);
		System.out.println(g.DFS());
		
	}
}
