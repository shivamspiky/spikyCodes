public class LongestPalindromicSubstring {

	public String longest(String str) {
		
		if(str==null || str.length()==1) {
			return str;
		}
		boolean[][] pal = new boolean[str.length()][str.length()];
		
		for(int i=0;i<pal.length;i++) {
			pal[i][i]=true;
		}
		int maxLength=1;
		int start=0;
		int end = 0;
		for(int len =2;len<=str.length();len++) {
			
			for(int i=0;i<=str.length()-len;i++) {
				
				int j=i+len-1;
				
				if(len==2) {
					pal[i][j]=str.charAt(i)==str.charAt(j);
					
					
				}else {
					pal[i][j]= str.charAt(i)==str.charAt(j) && pal[i+1][j-1];
				}
				if(pal[i][j]) {
					maxLength=len;
					start =i;
					end = j;
				}
			}
		}
		
		return str.substring(start, end+1);
	}  
	
	public static void main(String[] args) {
		LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
		String str = "forgeeksskeegfor";
		System.out.println(longestPalindromicSubstring.longest(str));
	}
}
