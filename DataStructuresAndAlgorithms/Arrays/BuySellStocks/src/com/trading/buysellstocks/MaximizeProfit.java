package com.trading.buysellstocks;

public class MaximizeProfit {

	/*Buy and sell stocks in a way such that you can first buy and then sell
	 * and then again buy and sell and don't leave at buy
	 * and you can't buy and sell on the same day*/
	public int maxProfit(int[] arr) {
		int profit = 0;
		int min = arr[0];
		int max_diff= Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			
			int diff = arr[i]-min;
			if(arr[i] < min) {
				min = arr[i];
			}
			
			if(max_diff > 0 && diff < max_diff) {
				profit +=max_diff;
				max_diff = Integer.MIN_VALUE;
				min = arr[i];
			}else {
				max_diff = diff;
			}
		}
		
		if(max_diff > 0) {
			profit+=max_diff;
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		MaximizeProfit maxProfit = new MaximizeProfit();
		int[] arr = {100,70,87,10};
		System.out.println(maxProfit.maxProfit(arr));
	}
}
