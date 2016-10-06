package com.arrays.smallestdifference;

public class SmallestDifference {
	public int smallestDiff(int[] arr, int x, int y) {
		int last = 0 , lastIndex=-1, diff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x){
				if(last==y){
					diff = Math.min(diff, i-lastIndex);
				}
				last = x;
				lastIndex = i;
			}
			else if(arr[i]==y){
				if(last == x){
					diff = Math.min(diff, i-lastIndex);
				}
				last = y;
				lastIndex = i;
			}
		}
		return diff;
	}
	
	public static void main(String args[]){
		SmallestDifference smallestDifference = new SmallestDifference();
		int[] arr =  {2, 5, 3, 5, 4, 4, 2, 3};
		System.out.println(smallestDifference.smallestDiff(arr, 3, 2));
	}
}
