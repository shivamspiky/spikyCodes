
public class LongestPalindromicSubstringInConstantSpace {

	public String getLongestPalindrome(String str) {
		
		String oddLengthPal = getOddLengthPal(str);
		String evenLengthPal = getEvenLengthPal(str);
		
		return oddLengthPal.length() > evenLengthPal.length() ? oddLengthPal : evenLengthPal;
		
	}
	
	private String getOddLengthPal(String str) {
		
		int maxLength =1;
		int start=0;
		int end = 0;
		
		for(int i=1;i<str.length();i++) {
			int tempStart = i-1;
			int tempEnd = i+1;
			while(tempStart >=0 && tempEnd <str.length()&& str.charAt(tempStart) == str.charAt(tempEnd)) {
				
				if(maxLength < tempEnd-tempStart + 1) {
					maxLength = tempEnd - tempStart + 1;
					start = tempStart;
					end = tempEnd;
				}
				tempStart--;
				tempEnd++;
			}
		}
		
		return str.substring(start,end+1);
	}
	
	private String getEvenLengthPal(String str) {
		
		int maxLength =0;
		int start=-1;
		int end=-1;
		
		for(int i=1;i<str.length();i++) {
			int tempStart = i-1;
			int tempEnd = i;
			while(tempStart >=0 && tempEnd <str.length()&& str.charAt(tempStart) == str.charAt(tempEnd)) {
				
				if(maxLength < tempEnd-tempStart + 1) {
					maxLength = tempEnd - tempStart + 1;
					start = tempStart;
					end = tempEnd;
				}
				tempStart--;
				tempEnd++;
			}
		}
		if(start==-1) {
			return "";
		}
		return str.substring(start,end+1);
	}
	
	public static void main(String[] args) {
		LongestPalindromicSubstringInConstantSpace palindromicSubstring = new LongestPalindromicSubstringInConstantSpace();
		System.out.println(palindromicSubstring.getLongestPalindrome("forgeeksskeegfor"));
	}
}
