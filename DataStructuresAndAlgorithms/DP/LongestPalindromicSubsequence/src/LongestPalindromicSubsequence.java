
public class LongestPalindromicSubsequence {

	public int longest(String str, int start, int end) {
		if(end-start ==0 ) {
			return end-start;
		}
		
		
		if(str.charAt(start)!=str.charAt(end)) {
			return Math.max(longest(str,start+1,end), longest(str,start,end-1));
		}
		
		if(end-start==1) {
			return 2;
		} else {
			return 2 + longest(str, start+1,end-1);
		}
	}
	
	public int longestDP(String str) {
		if(str.length()==0 || str.length() == 1) {
			return str.length();
		}
		
		int[][] Longest = new int[str.length()][str.length()];
		
		for(int len=1;len <= str.length();len++) {
			for(int i=0;i<=str.length()-len;i++) {
				int j=i+len-1;
				
				if(len==1) {
					Longest[i][j]=1;
				}
				else {
					if(str.charAt(i)!=str.charAt(j)) {
						Longest[i][j]=Math.max(Longest[i+1][j], Longest[i][j-1]);
					}
					else {
						if(len==2) {
							Longest[i][j]=2;
						} else {
							Longest[i][j] = 2 + Longest[i+1][j-1];
						}
					}
				}
			}
		}
		return Longest[0][str.length()-1];
		
	}
	
	
	public static void main(String[] args) {
		String str = "aabbeab";
		LongestPalindromicSubsequence longestPalindromicSubsequence = new LongestPalindromicSubsequence();
		System.out.println(longestPalindromicSubsequence.longestDP(str));
	}
}
