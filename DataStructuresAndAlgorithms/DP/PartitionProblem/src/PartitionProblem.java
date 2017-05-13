
public class PartitionProblem {
	
	public boolean exists(int[] arr) {
		int n = findSum(arr);
		
		if(n%2!=0) {
			return false;
		}
		
		return subSetExists(arr,n/2,arr.length-1);
	}
	
	private int findSum(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
	private boolean subSetExists(int[] arr, int k , int i) {
		
		if(k==0){
			return true;
		}
		
		if(i==0) {
			if(k==arr[0]){
				return true;
			}
			return false;
		}
		
		if(k>=arr[i]) {
			return subSetExists(arr,k-arr[i],i-1) || subSetExists(arr,k,i-1);
		}
		
		return subSetExists(arr,k,i-1);
	}
	
	private boolean existsDP(int[] arr) {
		int n = findSum(arr);
		
		if(n%2!=0) {
			return false;
		}
		
		boolean[][] partition = new boolean[(n/2)+1][arr.length];
		
		for(int i=0;i<arr.length;i++) {
			partition[0][i]=true;
		}
		
		partition[arr[0]][0]=true;
		for(int i=1;i<=n/2;i++) {
			
			for(int j=1;j<arr.length;j++) {
				
				
				if(arr[j]<=i) {
					partition[i][j]=partition[i][j-1] || partition[i-arr[j]][j-1]; 
				}
				else {
					partition[i][j]=partition[i][j-1];
				}
			}
		}
		
		return partition[n/2][arr.length-1];
	}
	
	public static void main(String[] args) {
		PartitionProblem partitionProblem  = new PartitionProblem();
		
		int[] arr = {1,5,11,5,1};
		int[] arr1= {10,16,22};
		
		System.out.println(partitionProblem.existsDP(arr));
		System.out.println(partitionProblem.existsDP(arr1));
	}
}
