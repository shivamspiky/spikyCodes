
public class EggDroppingPuzzle {

	/*find minimum of trials in worst case to find which floors
	 * are safe to drop the egg and which is not
	 * 
	 * it is worst case so we'll have to take the case which
	 * results in maximum trial out of egg breaks and egg doesn't break
	 * at each step for each floor
	 * 
	 * algorithm is simple
	 * try for each floor recursively and whichever  path results in min trials
	 * is minimum trials indeed
	 * 
	 * It seems we are calculating all possible trials imagining
	 * worst case scenario at each step and selecting the trials whith 
	 * min step*/
	int recursiveMin(int n, int k) {
		
		if(k==0 || k==1) {
			return k;
		}
		
		if(n==1) {
			return k;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i<=k;i++) {
			
			/*first egg breaks and in second case egg doesn't break*/
			int temp= 1 + Math.max(recursiveMin(n-1,i-1), recursiveMin(n,k-i));
			if(temp < min) {
				min = temp;
			}
		}
		
		return min;
	}
	
	int min(int n, int k) {
		int[][] Min = new int[n+1][k+1];
		for(int i=1;i<=n;i++) {
			Min[i][0]=0;
			Min[i][1]=1;
		}
		
		for(int j=0;j<=k;j++) {
			Min[1][j]=j;
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=k;j++) {
				
				int min= Integer.MAX_VALUE;
				
				for(int l=1;l<=j;l++) {
					int temp = 1 + Math.max(Min[i-1][l-1],Min[i][j-l]);
					
					if(temp < min) {
						min=temp;
					}
				}
				Min[i][j]=min;
				
			}
		}
		
		return Min[n][k];
		
	}
	
	public static void main(String[] args) {
		EggDroppingPuzzle eggDroppingPuzzle = new EggDroppingPuzzle();
		
		System.out.println(eggDroppingPuzzle.min(2, 36));
	}
}
