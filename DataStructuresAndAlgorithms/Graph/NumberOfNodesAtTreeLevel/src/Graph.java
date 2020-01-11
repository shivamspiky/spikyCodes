import java.util.LinkedList;
import java.util.Queue;

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
	
	int BFSUtil(int reqLevel){
		boolean[] visited = new boolean[this.v];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		visited[0]=true;
		int level=0;
		while(!queue.isEmpty()){
			int n = queue.size();
			if(level == reqLevel)
				return n;
			for(int i=0;i<n;i++){
				int v = queue.poll();
				for(int j=0;j<adj[v].size();j++){
					if(!visited[adj[v].get(j)]){
						queue.add(adj[v].get(j));
						visited[adj[v].get(j)]=true;
					}
						
				}
			}
			level++;
		}
		
		return 0;
	}
	
	public static void main(String[] args){
		Graph g = new Graph(7); 
	    g.addEdge(0, 1); 
	    g.addEdge(0, 2); 
	    g.addEdge(1, 3); 
	    g.addEdge(1, 4); 
	    g.addEdge(1, 5); 
	    g.addEdge(2, 6); 
	    
	    int count = g.BFSUtil(2);
	    System.out.println(count);
	}
}
