
public class CuttingARod {

	public int max(int[] arr, int n) {
		
		if(n==0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		
		for(int i=1;i<=n;i++) {
			int temp = arr[i-1]  + max(arr,n-i);
			if(temp > max) {
				max = temp;
			}
		}
		
		return max;
	}
	
	public int maxDP(int[] arr) {
		int n = arr.length;
		
		if(n==0){
			return 0;
		}
		int[] Max = new int[n+1];
		Max[0]=0;
		for(int i=1;i<=n;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=1;j<=i;j++) {
				int temp = arr[j-1] + Max[i-j];
				
				if(temp > max) {
					max = temp;
				}
			}
			
			Max[i]=max;
		}
		
		return Max[n];
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
		CuttingARod cutting = new CuttingARod();
		System.out.println(cutting.maxDP(arr));
	}
	
}
