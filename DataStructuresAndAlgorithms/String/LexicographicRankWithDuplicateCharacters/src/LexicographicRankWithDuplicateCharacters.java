public class LexicographicRankWithDuplicateCharacters {
	
	public int rank(String str) {
		if(str==null || str.length()==0) {
			return 0;
		}
		
		int[] count = new int[256];
		int[] frequency = new int[256];
		
		for(int i=0;i<str.length();i++) {
			
			count[str.charAt(i)]=1;
			frequency[str.charAt(i)]++;
		}
		
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		
		int[] fact = fact(str.length());
		print(fact);
		int rank=0;
		for(int i=0;i<str.length();i++) {
			
			for(int k=0;k<count[str.charAt(i)]-1;k++) {
				int temp =fact[str.length()-1-i];
				int tempCount=0;
				for(int j=0;j<str.charAt(i);j++) {
					
					if(frequency[j]==0) {
						continue;
					} else {
						tempCount++;
					}
					
					if(tempCount-1==k) {
						temp/=fact[frequency[j]-1];
						
					} else {
						temp/=fact[frequency[j]];
					}
				}
				rank+=temp;
				
			}
			removeFromCount(count,frequency,str.charAt(i));
			
		}
		return rank+1;
	}
	
	private void removeFromCount(int[] count, int[] frequency, char ch) {
		
		for(int i=ch;i<count.length;i++) {
			count[i]-=1;
		}
		
		frequency[ch]--;
	}
	
	public void print(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private int[] fact(int n) {
		int[] factArray = new int[n+1];
		factArray[0]=1;
		factArray[1]=1;
		int i = 2;
		int fact = 1;
		while(i<=n) {
			fact*=i;
			factArray[i]=fact;
			i++;
		}
		return factArray;
	}
	
	public static void main(String[] args) {
		LexicographicRankWithDuplicateCharacters lexicographicRankWithDuplicateCharacters = new LexicographicRankWithDuplicateCharacters();
		
		System.out.println(lexicographicRankWithDuplicateCharacters.rank("BCAA"));
	}
	
}
