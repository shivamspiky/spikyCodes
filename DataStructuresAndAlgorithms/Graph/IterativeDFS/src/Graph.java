import java.util.LinkedList;
import java.util.Stack;

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
	
	void DFSUtil(boolean[] visited, int vertex){
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(vertex);
		visited[vertex]=true;
		while(!stack.isEmpty()){
			int v = stack.pop();
			System.out.print(v+"\t");
			int n = adj[v].size();
			for(int i=0;i<n;i++){
				if(!visited[adj[v].get(i)]){
					stack.add(adj[v].get(i));
					visited[adj[v].get(i)]=true;
				}
					
			}
		}
		System.out.println();
	}
	
	void DFS(){
		boolean[] visited = new boolean[this.V];
		for(int i=0;i<this.V;i++){
			if(!visited[i])
				DFSUtil(visited,i);
		}
	}
	
	public static void main(String[] args){
		Graph g = new Graph(5); 
        g.addEdge(1, 0); 
        g.addEdge(2, 1); 
        g.addEdge(3, 4); 
        g.addEdge(4, 0);
        g.DFS();
	}
}
