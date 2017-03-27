package com.dp.longestcommonsubsequence;

public class LongestCommonSubsequence {

	public int longestSubsequenceLength(String str1, String str2) {
		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
			return 0;
		}
		
		/*calling these functions every time will increase complexity as it is not an attribute
		 * like length of array but function which will take O(n) time to solve*/
		int n = str1.length();
		int m = str2.length();
		int[][] longestCommonSubsequence = new int[n + 1][m + 1];
		int i, j;
		
		for (i = n-1; i >= 0; i--) {
			for (j = m-1; j >= 0; j--) {
				if (str1.charAt(i) == str2.charAt(j)) {
					longestCommonSubsequence[i][j] = 1 + longestCommonSubsequence[i + 1][j + 1];
					
					
				} else {
					longestCommonSubsequence[i][j] = Math.max(
							longestCommonSubsequence[i + 1][j],
							longestCommonSubsequence[i][j + 1]);
				}
			}
		}
		printSubsequence(longestCommonSubsequence, str1, str2);
		
		return longestCommonSubsequence[0][0];
	}

	private void printSubsequence(final int[][] longestCommonSubsequenceLength,
			String str1, String str2) {
		
		int i=0,j=0;
		
		int n = str1.length();
		int m = str2.length();
		while(i<n && j<m){
			
				if(str1.charAt(i) == str2.charAt(j)){
					System.out.print(str1.charAt(i));
					i++;
					j++;
				}
				else if(longestCommonSubsequenceLength[i+1][j]>longestCommonSubsequenceLength[i][j+1]){
					i++;
				}else{
					j++;
				}
		}
		
	}

	public static void main(String[] args) {

		String str1 = "ABCBDAB";
		String str2 = "BDCABA";
		LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
		int result = longestCommonSubsequence.longestSubsequenceLength(str1,
				str2);
		System.out.println("\n"+result);
	}
}
