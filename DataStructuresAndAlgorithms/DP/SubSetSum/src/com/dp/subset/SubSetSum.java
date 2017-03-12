package com.dp.subset;

public class SubSetSum {

	public boolean sum(int[] arr, int k) {
		
		boolean[][] subSetSumArray = new boolean[arr.length+1][k+1];
		
		for(int i=0;i<=arr.length;i++) { // you will always have a subset with sum 0 empty subset is subset of every set including empty set
			subSetSumArray[i][0]=true;
		}
		
		for(int i=1;i<=k;i++) { // if you have empty set it can only give sum 0 except that for every sum it will return false
			subSetSumArray[0][i]=false;
		} 
		
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=k;j++) {
				
				if(arr[i-1] > j) {   // if ith element value is greater than sum then we have to ignore ith element
					subSetSumArray[i][j] = subSetSumArray[i-1][j]; 
				} else {
					subSetSumArray[i][j] = subSetSumArray[i-1][j] || subSetSumArray[i-1][j-arr[i-1]];
				}
			}
		}
		return subSetSumArray[arr.length][k];
	}
	
	public boolean sumRecursive(int[] arr, int n, int k) {
		
		if(k==0) {
			return true;
		}
		
		if(n==0 && k!=0) {
			return false;
		}
		
		if(arr[n-1] > k) {
			return sumRecursive(arr,n-1,k);
		}
		else {
			return sumRecursive(arr,n-1,k) || sumRecursive(arr,n-1,k-arr[n-1]);
		}
	} 
	
	public static void main(String[] args) {
		int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 53;
        //int n = set.length;
        SubSetSum subSetSum = new SubSetSum();
        if (subSetSum.sum(set,sum) == true) {
        	System.out.println("Found a subset with given sum");
        }
        else
           System.out.println("No subset with given sum");
	}
	
}
