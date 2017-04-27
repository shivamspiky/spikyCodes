
public class LongestBitonicSubsequence {

	public int longest(int[] arr) {
		
		int[] LIS = longestIncreasing(arr);
		int[] LDS = longestDecreasing(arr);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int temp = LIS[i]+LDS[i]-1;
			if(temp > max) {
				max = temp;
			}
		}
		
		return max;
	}
	
	private int[] longestIncreasing(int[] arr) {
		
		int[] LIS = new int[arr.length];
		LIS[0]=1;
		
		for(int i=1;i<arr.length;i++) {
			int max =  Integer.MIN_VALUE;
			for(int j=i-1;j>=0;j--) {
				if(arr[j] < arr[i]) {
					int temp = 1+LIS[j];
					if(temp > max) {
						max = temp;
					}
				}
			}
			LIS[i]=max;
		}
		
		return LIS;
	}
	
	private int[] longestDecreasing(int[] arr) {
		
		int[] LDS = new int[arr.length];
		LDS[arr.length-1]=1;
		
		for(int i=arr.length-2;i>=0;i--) {
			int max =  Integer.MIN_VALUE;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[i]) {
					int temp = 1+LDS[j];
					if(temp > max) {
						max = temp;
					}
				}
			}
			LDS[i]=max;
		}
		
		return LDS;
	}
	
	public static void main(String[] args) {
		LongestBitonicSubsequence longBitonic = new LongestBitonicSubsequence();
		int[] arr = {1, 11, 2, 10, 4, 5, 2, 1};
		System.out.println(longBitonic.longest(arr));
	}
}
