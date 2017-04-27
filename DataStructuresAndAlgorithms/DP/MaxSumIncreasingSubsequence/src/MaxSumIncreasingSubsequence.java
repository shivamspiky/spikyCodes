
public class MaxSumIncreasingSubsequence {
	
	// max sum increasing subsequence ending at element n
	private int maxUtil(int[] arr, int n) {
		if(n==0) {
			return arr[0];
		}
		
		int max=Integer.MIN_VALUE;
		int temp=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--) {
			if(arr[i] < arr[n]) {
				temp = maxUtil(arr,i);
			}
			
			if(temp > max) {
				max = temp;
			}
		}
		
		return arr[n]+max;
		
	}
	
	public int max(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i <= n-1;i++) {
			int temp = maxUtil(arr,i);
			//System.out.println(temp);
			if(temp > max) {
				max = temp;
			}
		}
		
		return max;
	}
	
	public int maxDP(int[] arr) {
		int[] L = new int[arr.length];
		L[0]=arr[0];
		int max = Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			int temp=Integer.MIN_VALUE;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]  < arr[i] && L[j] > temp) {
					temp = L[j];
				}
			}
			
			L[i]=temp+arr[i];
			if(L[i] > max) {
				max = L[i];
			}
		}
		
		return max;
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 101, 2, 3, 100, 4, 5};
		MaxSumIncreasingSubsequence maxSumIncreasingSubsequence = new MaxSumIncreasingSubsequence();
		System.out.println(maxSumIncreasingSubsequence.maxDP(arr));
	}
}
