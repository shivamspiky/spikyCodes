package com.dp.longestcommonsubsequence;

public class LongestCommonSubsequence {

	public int longestSubsequenceLength(String str1, String str2) {
		if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
			return 0;
		}
		int[][] longestCommonSubsequence = new int[str1.length() + 1][str2
				.length() + 1];
		int i, j;
		
		
		for (i = str1.length(); i >= 0; i--) {
			for (j = str2.length(); j >= 0; j--) {
				if(i==str1.length() || j==str2.length()){
					longestCommonSubsequence[i][j]=0;
				}
				else if (str1.charAt(i) == str2.charAt(j)) {
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
		while(i<str1.length() && j<str2.length()){
			
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
		System.out.println("".length());
	}
}
