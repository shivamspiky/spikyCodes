import java.util.Arrays;


public class AllPermutationsWithRepitionOfCharacters {

	public void printPermute(String str, char[] permute, int len) {
		
		if(len==str.length()) {
			System.out.println(String.valueOf(permute));
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			permute[len]=str.charAt(i);
			printPermute(str,permute,len+1);
			
		}
	}
	
	public static void main(String[] args) {
		String str = "BAC";
		char[] charArray = str.toCharArray();
		//System.out.println(charArray);
		Arrays.sort(charArray);
		//System.out.println(charArray);
		//System.out.println(String.valueOf(charArray));
		AllPermutationsWithRepitionOfCharacters allPermutationsWithRepitionOfCharacters = new AllPermutationsWithRepitionOfCharacters();
		allPermutationsWithRepitionOfCharacters.printPermute(String.valueOf(charArray), new char[str.length()], 0);
	}
}
