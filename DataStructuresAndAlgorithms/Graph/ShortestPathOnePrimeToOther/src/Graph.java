import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	int v;
	LinkedList<Integer>[] adj;
		
	public Graph(int v){
			this.v = v;
			adj = new LinkedList[v];
			for(int i=0;i<v;i++){
				adj[i]= new LinkedList<Integer>();
			}
		}
		
	void addEdge(int u, int v){
			adj[u].add(v);
			adj[v].add(u);
		}
	
	static List<Integer> getPrimes(){
		int n=9999;
		boolean[] isPrime = new boolean[n+1];
		for(int i=0;i<n;i++){
			isPrime[i]=true;
		}
		
		for(int i=2;i*i<=n;i++){
			if(isPrime[i]){
				for(int j=i*i;j<=n;j=j+i){
					isPrime[j]=false;
				}
			}
		}
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=1000;i<=9999;i++){
			if(isPrime[i]){
				primes.add(i);
			}
		}
		return primes;
	}
	
	void createAdj(List<Integer> primes){
		
		
	}
	
	boolean reachable(int prime1, int prime2){
		int count=0;
		if(prime1%10 != prime2%10)
			count++;
		if((prime1/10)%10 != (prime2/10)%10)
			count++;
		if((prime1/100)%10 != (prime2/100)%10)
			count++;
		if((prime1/1000)%10 != (prime2/1000)%10)
			count++;
		return count==1;
	}
	
	int shortestPath(int prime1, int prime2, List<Integer> primes){
		
		int prime1_index=-1;
		int prime2_index=-1;
		for(int i=1;i<primes.size();i++){
			for(int j=i-1;j>=0;j--){
				if(reachable(primes.get(i),primes.get(j))){
					addEdge(i,j);
					addEdge(j,i);
				}
				if(primes.get(j) == prime1 ){
					prime1_index=j;
				}
				if(primes.get(j) == prime2 ){
					prime2_index=j;
				}
			}
			if(primes.get(i) == prime1 ){
				prime1_index=i;
			}
			if(primes.get(i) == prime2 ){
				prime2_index=i;
			}
		}
		
		if(prime1_index == -1 || prime2_index==-1)
			return -1;
		
		if(prime1 == prime2)
			return 1;
		
		
		int[] visited = new int[this.v];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(prime1_index);
		visited[prime1_index]=1;
		
		while(!queue.isEmpty()){
			int v = queue.poll();
			int n = adj[v].size();
			for(int i=0;i<n;i++){
				if(visited[adj[v].get(i)]==0){
					queue.add(adj[v].get(i));
					visited[adj[v].get(i)]=1+visited[v];
				}
				
				if(prime2_index==adj[v].get(i))
					return 1+visited[v];
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		int prime1 = 1033;
		int prime2 = 8179;
		List<Integer> primes = getPrimes();
		Graph g = new Graph(primes.size());
		System.out.println(g.shortestPath(prime1, prime2,primes));
	}
}
