package com.dp.maikingchange;

public class MakingChange {

	public int minCoins(int C, int[] denominations){
		int [] min = new int[C+1];
		min[0]=0;
		
		boolean used = false;
		for(int i = 1 ;i<= C;i++) {
			int j;
			int temp = Integer.MAX_VALUE;
			for(j = 0 ; j< denominations.length ; j++) {
				if(i-denominations[j] < 0) { // denominations array needn't be sorted
					continue;
				}
				used = true;			// to return right value in scenario where C is lesser than all denominations.
										// need to return zero in that scenario. without used flag we'll be returning 1
				temp = Math.min(temp,min[i-denominations[j]]);
			} 
			if(used) {
				min[i]=1+temp;
			}
		}
		return min[C];
	}
	
	public static void main(String[] args) {
		MakingChange makingChange = new MakingChange();
		int[]  denominations = {5,2,1,10,20,50};
		System.out.println(makingChange.minCoins(194, denominations));
	}
}
