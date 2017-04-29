
public class StringInterleavingOfTwoStrings {

	
	/*works only for case when strings are made up of different characters*/
	public boolean interleaving(String str, String str1, String str2) {
		int i=0;
		int j=0;
		int k=0;
		if(str.length()!=(str1.length()+str2.length())) {
			return false;
		}
		while(k<str.length()) {
			if(i< str1.length() && str.charAt(k)==str1.charAt(i)) {
				i++;
			}else if(j < str2.length() && str.charAt(k)==str2.charAt(j)) {
				j++;
			}else {
				return false; 
			} 
			k++;
		}
		
		return true;
	}
	
	/*recursive solution for cases even with same characters*/
	private boolean interleavingRecursive(String str, int start, 
			String str1, int start1, String str2, int start2) {
		
		if(start==str.length() && start1==str1.length() && start2==str2.length()) {
			return true;
		}
		if(start==str.length()) {
			return false;
		}
		
		
		return (start1< str1.length() && str.charAt(start)==str1.charAt(start1) && interleavingRecursive(str,start+1,str1,start1+1,str2,start2)
				
				)||(start2 < str2.length() && str.charAt(start)==str2.charAt(start2) && interleavingRecursive(str,start+1,str1,start1,str2,start2+1));
	}
	
	public boolean recurseInterleaving(String str, String str1, String str2) {
		if(str.length()!=str1.length()+str2.length()) {
			return false;
		}
		
		return interleavingRecursive(str, 0, str1, 0, str2, 0);
	}
	
	
	public boolean interleavingDP(String str, String str1, String str2) {
		if(str.length() != str1.length() + str2.length()) {
			return false;
		}
		
		boolean[][] IL = new boolean[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<=str1.length();i++) {
			for(int j=0;j<=str2.length();j++) {
				if(i==0 && j==0) {
					IL[i][j]=true;
				}
				else if(i==0) {
					IL[i][j] = (str.charAt(i+j-1)==str2.charAt(j-1)) && IL[i][j-1];
				}
				
				else if(j==0) {
					IL[i][j] = (str.charAt(i+j-1)==str1.charAt(i-1)) && IL[i-1][j];
				}
				
				else if(str1.charAt(i-1)==str.charAt(i+j-1) &&
						str2.charAt(j-1)==str.charAt(i+j-1)) {
					IL[i][j] = IL[i-1][j] || IL[i][j-1];
				}
				else if(str1.charAt(i-1)==str.charAt(i+j-1)) {
					IL[i][j] = IL[i-1][j];
				} 
				else if(str2.charAt(j-1)==str.charAt(i+j-1)) {
					IL[i][j] = IL[i][j-1];
				}
				else {
					IL[i][j]=false;
				}
			}
		}
		
		return IL[str1.length()][str2.length()];
	}
	
	public static void main(String[] args) {
		String str1= "AA";
		String str2="ACA";
		String str = "AACAA";
		
		StringInterleavingOfTwoStrings stringInterleavingOfTwoStrings = new StringInterleavingOfTwoStrings();
		//System.out.println(stringInterleavingOfTwoStrings.interleaving(str, str1, str2));
		System.out.println(stringInterleavingOfTwoStrings.recurseInterleaving(str, str1, str2));
		System.out.println(stringInterleavingOfTwoStrings.interleavingDP(str, str1, str2));
	}
}
