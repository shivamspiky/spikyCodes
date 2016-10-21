package com.dp.longestincreasingsubsequence;

public class LongestIncreasingSubsequence {
	public int longest(int[] arr) {
		int[] subsequenceLength  = new int [arr.length];
		subsequenceLength[0]=1;
		for(int i=1;i<arr.length;i++) {
			int temp = 0;
			for(int j=i-1;j>=0;j--) {
				if(arr[j] < arr[i]) {
					temp = Math.max(temp,subsequenceLength[j]);
				}
			}
			subsequenceLength[i]=1+temp;
		}
		int max = subsequenceLength[0];
		for(int i=1;i<subsequenceLength.length;i++) {
			max= Math.max(max,subsequenceLength[i]);
		}
		return max;
	}
	
	public static void main(String[] args) {
		LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
		int[] arr = {5,6,2,3,4,1,9,9,8,9,5};
		
		System.out.println(longestIncreasingSubsequence.longest(arr));
	} 
}
