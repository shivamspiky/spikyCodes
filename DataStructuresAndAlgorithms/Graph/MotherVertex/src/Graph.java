import java.util.LinkedList;
/*
* Author : Shivam Kumar
* */
public class Graph {
	int v;
	LinkedList<Integer>[] adj;
	int lastFinished;
	
	public Graph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void DFSUtil(boolean[] visited, int vertex){
		visited[vertex]=true;
		for(int i=0;i<adj[vertex].size();i++){
			if(!visited[adj[vertex].get(i)]){
				DFSUtil(visited, adj[vertex].get(i));
			}
		}
		this.lastFinished=vertex;
	}
	public void addEdge(int u,int v){
		this.adj[u].add(v);
	}
	
	public void DFS(boolean[] visited){
		for(int i=0;i<v;i++){
			if(!visited[i])
				DFSUtil(visited,i);
		}
	}
	public int findMother(){
		boolean[] visited = new boolean[v];
		DFS(visited);
		boolean[] newVisited = new boolean[v];
		DFSUtil(newVisited, this.lastFinished);
		for(int i=0;i<v;i++){
			if(!visited[i])
				return -1;
		}
		
		return this.lastFinished;
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
	    int mother = g.findMother();
	    if( mother == -1 )
	    	System.out.println( "No mother vertex exists");
	    else
	    	System.out.println("Mother Vertex: " + mother );
	}
}
