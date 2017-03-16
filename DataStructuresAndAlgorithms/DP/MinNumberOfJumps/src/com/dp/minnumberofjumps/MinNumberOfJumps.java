package com.dp.minnumberofjumps;

public class MinNumberOfJumps {

	public int rec_min_jumps(int[] arr, int i) {
		if(i==arr.length-1) {
			return 0;
		}
		
		if(arr[i]==0) {
			return Integer.MAX_VALUE;
		}
		int min = Integer.MAX_VALUE;
		for(int j=1;j<=arr[i] && i+j<arr.length;j++) {
			
			if(arr[i+j]==0) {
				continue;
			} 
			else {
				int temp_min = rec_min_jumps(arr,i+j);
				if(temp_min < min) {
					min = temp_min;
				}
			}
		}
		if(min==Integer.MAX_VALUE) {
			return min;
		}
		else {
			return 1+min;
		}
		
	}
	
	public int min_jumps(int[] arr) {
		
		int[] min = new int[arr.length];
		min[arr.length-1]=0;
		
		for(int i=arr.length-2;i>=0;i--) {
			
			if(arr[i]==0) {
				min[i]=Integer.MAX_VALUE;
				continue;
			}
			int temp_min = Integer.MAX_VALUE;
			for(int j=1;j<=arr[i] && i+j<arr.length;j++) {
				if(min[i+j]<temp_min) {
					temp_min = min[i+j];
				}
			}
			
			if(temp_min==Integer.MAX_VALUE) {
				min[i]=Integer.MAX_VALUE;
			}else {
				min[i]=1+temp_min;
			}
		}
		return min[0];
	}
	
	public static void main(String[] args) {
		MinNumberOfJumps minNumberOfJumps = new MinNumberOfJumps();
		int[] arr = {1, 3, 6, 1, 0, 9};
		
		System.out.println(minNumberOfJumps.min_jumps(arr));
	}
}
