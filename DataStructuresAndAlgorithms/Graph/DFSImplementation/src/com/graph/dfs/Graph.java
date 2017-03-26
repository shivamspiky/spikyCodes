package com.graph.dfs;

import java.util.LinkedList;

public class Graph {
	
	private int v;
	private LinkedList<Integer>[] adjacencyList;
	
	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public LinkedList<Integer>[] getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(LinkedList<Integer>[] adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public Graph(int v) {
		this.v = v;
		adjacencyList = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adjacencyList[i]= new LinkedList();
		}
	}
	
	public void addEdge(int v, int w) {
		adjacencyList[v].add(w);
	}

	
	/*works only for connected graph*/
	public void DFS(int v) {
		boolean[] visited = new boolean[this.v];
		
		
		
		DFSUtil(v,visited);
	}
	
	/*for both connected and disconnected graph follow below algo*/
	
	public void DFS() {
		boolean[] visited = new boolean[this.v];
		
		/*we need to call this function on each unvisited node first
		 *as we could have disconnected components in our graph which
		 *are not reachable from source node
		 *to take care of this case we need to call DFSUtil in a loop over
		 *all nodes offcourse which are unvisited 
		 * */ 
		
		for(int i=0;i<v;i++) {
		
			if(!visited[i]) {
				DFSUtil(i,visited);
			}
		}
		
	}
	private void DFSUtil(int v, boolean[] visited) {
		
		visited[v]=true;
		System.out.println(v);
		int n = adjacencyList[v].size();
		for(int i=0;i<n;i++) {
			
			if(!visited[adjacencyList[v].get(i)]) {
				DFSUtil(adjacencyList[v].get(i),visited);
			}
		}
	}
	public static void main(String[] args) {
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.DFS(2);
        g.DFS();
	}
}