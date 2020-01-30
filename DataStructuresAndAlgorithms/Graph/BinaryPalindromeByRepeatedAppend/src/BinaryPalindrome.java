import java.util.LinkedList;

public class BinaryPalindrome {
	
	
	static void  DFS(int v, LinkedList<Integer>[] adj, boolean[] ans){
		ans[v]=true;
		int n = adj[v].size();
		for(int i=0;i<n;i++){
			if(!ans[adj[v].get(i)]){
				DFS(adj[v].get(i), adj,ans);
			}
		}
	}
	static void  printBinaryPalin(int n , int k){
		int[] arr = new int[n];
		boolean[] ans = new boolean[k];
		for(int i=0;i<n;i++){
			arr[i]= i%k;
		}
		
		LinkedList<Integer>[] adj = new LinkedList[k];
		for(int i=0;i<k;i++){
			adj[i] = new LinkedList<Integer>();
		}
		
		for(int i=0;i<n/2;i++){
			adj[arr[i]].add(arr[n-1-i]);
			adj[arr[n-1-i]].add(arr[i]);
		}
		
		DFS(0,adj,ans);
		
		for(int i=0;i<n;i++){
			if(ans[arr[i]]){
				System.out.print(1);
			}else{
				System.out.print(0);
			}
		}
	}

	public static void main(String[] args){
		int n=10;
		int k=4;
		printBinaryPalin(n,k);
	}
}
