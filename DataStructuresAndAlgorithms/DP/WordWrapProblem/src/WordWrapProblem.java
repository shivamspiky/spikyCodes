
public class WordWrapProblem {

	public int minCost(int[] arr, int m) {
		
		int[] Cost = new int[arr.length+1];
		Cost[arr.length]=0;
		Cost[arr.length-1]= (m-arr[arr.length-1])*(m-arr[arr.length-1]);
		int n = arr.length;
		for(int i=n-2;i>=0;i--) {
			int min = Integer.MAX_VALUE;
			int j=i+1;
			int sum=arr[i];
			int tempCost=0;
			while(sum <=m && j<=n) {
				tempCost=(m-sum)*(m-sum)+Cost[j];
				if(tempCost < min) {
					min = tempCost;
				}
				
				if(j<n) {
					sum+=arr[j];
					sum++;
				}
				
				j++;
				
			}
			Cost[i]=min;
		}
		
		return Cost[0];
	}
	
	public static void main(String[] args) {
		WordWrapProblem wordWrapProblem = new WordWrapProblem();
		
		int[] arr = {3, 2, 2, 5};
		System.out.println(wordWrapProblem.minCost(arr,6));
	}
}
