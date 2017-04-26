package com.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

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
	
	public void BFS(int s) {
		
		boolean[] visited = new boolean[v];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int temp = queue.remove();
			System.out.println(temp);
			visited[temp] = true;
			int n = adjacencyList[temp].size();
			for(int i=0;i<n;i++) {
				if(!visited[adjacencyList[temp].get(i)]) {
					queue.add(adjacencyList[temp].get(i));
				}
			}
		}
	}
	
	public void BFS() {
		boolean[] visited = new boolean[v];
		for(int i=0;i<v && !visited[i];i++) {
			BFSUtil(i,visited);
		}
	}
	
	private void BFSUtil(int s, boolean[] visited) {
		
		/*very similar to level order traversal.
		 * Only difference is instead of left and right nodes
		 * getting inserted in queue.We are inserting all unvisited nodes
		 * from that */
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		visited[s] = true;
		while(!queue.isEmpty()) {
			int temp = queue.remove();
			System.out.println(temp);
			
			int n = adjacencyList[temp].size();
			for(int i=0;i<n;i++) {
				if(!visited[adjacencyList[temp].get(i)]) {
					queue.add(adjacencyList[temp].get(i));
					visited[adjacencyList[temp].get(i)] = true;
				}
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
        g.BFS(2);
        g.BFS();
	}
}
