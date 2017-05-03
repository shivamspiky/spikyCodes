
public class ReversingOnlyVowels {
	
	public String reverse(String str) {
		
		if(str==null || str.length()==0) {
			return str;
		}
		
		char[] charArray = str.toCharArray();
		int i=0;
		int j=charArray.length-1;
		while(i < j) {
			
			if(isVowel(charArray[i]) && isVowel(charArray[j])) {
				char temp = charArray[i];
				charArray[i]=charArray[j];
				charArray[j]=temp;
				i++;
				j--;
			}
			
			if(!isVowel(charArray[i])) {
				i++;
			}
			
			if(!isVowel(charArray[j])) {
				j--;
			}
		}
		
		return String.valueOf(charArray);
	}
	
	private boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String str = "abcdefoi";
		
		ReversingOnlyVowels reversingOnlyVowels = new ReversingOnlyVowels();
		System.out.println(reversingOnlyVowels.reverse(str));
	}
}
