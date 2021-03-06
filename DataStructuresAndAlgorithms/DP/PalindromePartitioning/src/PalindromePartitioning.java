
public class PalindromePartitioning {

	public int minCuts(String str) {
		
		if(str==null || isPalindrome(str,0,str.length()-1)) {
			return 0;
		}
		
		int[][] minCuts = new int[str.length()][str.length()];
		boolean[][] pal = new boolean[str.length()][str.length()];
		
		for(int i=0;i<str.length();i++) {
			pal[i][i]=true;
		}
		
		for(int l=2;l<=str.length();l++) {
			
			for(int i=0;i<=str.length()-l;i++) {
				int j=i+l-1;
				
				boolean isPalin =false;
				if(l==2) {
					isPalin = str.charAt(i)==str.charAt(j);
				} else {
					isPalin = (str.charAt(i) == str.charAt(j)) && pal[i+1][j-1];
					
				}
				pal[i][j]=isPalin;
				if(isPalin) {
					minCuts[i][j]=0;
				} else {
					int min = Integer.MAX_VALUE;
					for(int k=i;k<j;k++) {
						if(minCuts[i][k]+minCuts[k+1][j] < min) {
							min = minCuts[i][k]+minCuts[k+1][j];
						}
					}
					minCuts[i][j]=min+1;
				}
			}
		}
		
		return minCuts[0][str.length()-1];
	}
	
	public int minCutsOptimized(String str) {
		boolean[][] Pal = new boolean[str.length()][str.length()];
		int[] Cuts = new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			Pal[i][i]=true;
		}
		
		for(int l=2;l<=str.length();l++) {
			
			for(int i=0;i<=str.length()-l;i++) {
				int j=i+l-1;
				
				Pal[i][j]=(str.charAt(i)==str.charAt(j)) && (Pal[i+1][j-1]);
			}
		}
		
		for(int i=1;i<str.length();i++) {
			Cuts[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++) {
				
				if(Pal[j+1][i]==true && Cuts[j]+1 < Cuts[i]) {
					Cuts[i]=Cuts[j]+1;
				}
			}
		}
		
		return Cuts[str.length()-1];
	}
	
	public boolean isPalindrome(String str, int i,int j) {
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "ababbbabbababa";
		PalindromePartitioning palindromePartitioning = new PalindromePartitioning();
		
		System.out.println(palindromePartitioning.minCutsOptimized(str));
	}
}
