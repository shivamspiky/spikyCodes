public class LexicographicRankOfStringWithDifferentCharacters {
	
	public int rank(String str) {
		if(str==null || str.length()==0) {
			return 0;
		}
		
		int[] count = new int[256*256];
		
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		
		int fact = fact(str.length());
		int rank=0;
		for(int i=0;i<str.length();i++) {
			fact /=str.length()-i;
			rank+=fact*(count[str.charAt(i)]-1);
			removeFromCount(count,str.charAt(i));
		}
		
		return rank+1;
	}
	
	private void removeFromCount(int[] count, char ch) {
		
		for(int i=ch;i<count.length;i++) {
			count[i]-=1;
		}
	}
	
	private int fact(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		
		int result = n;
		n=n-1;
		while(n!=0) {
			result*=n;
			n=n-1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LexicographicRankOfStringWithDifferentCharacters lexicographicRankOfStringWithDifferentCharacters = new LexicographicRankOfStringWithDifferentCharacters();
		
		System.out.println(lexicographicRankOfStringWithDifferentCharacters.rank("STRING"));
	}
	
}
