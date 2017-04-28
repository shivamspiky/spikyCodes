
public class SmallestWindowContainingAllCharacters {

	public String smallest(String str1, String str2) {
		if(str1==null || str2==null) {
			return null;
		}
		if(str1.length() < str2.length()) {
			return null;
		}
		
		int[] count_pattern = new int[256];
		int[] count_string = new int[256];
		for(int i=0;i<str2.length();i++) {
			count_pattern[str2.charAt(i)]++;
		}
		int min_len = Integer.MAX_VALUE;
		int start_index=-1;
		int start=0;
		int count=0;
		for(int i=0;i<str1.length();i++) {
			
			/*contains count of characters in current sliding window.
			 * don't get confused that it contains count of characters in 
			 * string as a whole*/
			count_string[str1.charAt(i)]++;
			if(count_pattern[str1.charAt(i)]!=0 && 
					count_string[str1.charAt(i)] <=count_pattern[str1.charAt(i)]) {
				count++;
			}
			
			if(count==str2.length()) {
				/*if the start character is not in pattern
				 * and start character occurs more than in pattern
				 * we can shift our window and when
				 * we shift our window count of this particular
				 * character in new window gets decremented by 1*/
				while(count_pattern[str1.charAt(start)]==0 || 
						count_string[str1.charAt(start)] > count_pattern[str1.charAt(start)]) {
						
						count_string[str1.charAt(start)]--;
						start++;
				}
				if(i-start+1 < min_len){
					min_len = i-start+1;
					start_index = start;
				}
			}
		}
		if(start_index==-1) {
			return null;
		}
		return str1.substring(start_index,start_index+min_len);
	}
	
	public static void main(String[] args) {
		String str = "this is a test string";
		String pattern = "tist";
		SmallestWindowContainingAllCharacters smallestWindowContainingAllCharacters = new SmallestWindowContainingAllCharacters();
		System.out.println(smallestWindowContainingAllCharacters.smallest(str, pattern));
				
	}
}
