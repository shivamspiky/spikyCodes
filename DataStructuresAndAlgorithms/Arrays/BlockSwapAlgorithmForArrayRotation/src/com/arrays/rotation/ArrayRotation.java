package com.arrays.rotation;

public class ArrayRotation {
	
	public void recursiveBlockSwap(int[] arr, int d) {
		
		recursiveBlockSwapUtil(arr,0,d-1,d,arr.length-1);
	}
	
	private void recursiveBlockSwapUtil(int[] arr, int i, int j, int k, int l) {
		
		if(j-i==l-k) {
			swap(arr,i,j,k,l);
			return ;
		}
		
		else if(j-i< l-k) {
			swap(arr,i,j,l-(j-i),l);
			recursiveBlockSwapUtil(arr,i,j,j+1,l-(j-i)-1);
		} else {
			
			swap(arr,i,i+(l-k),k,l);
			recursiveBlockSwapUtil(arr,i+(l-k)+1,k-1,k,l);
		}
	}
	/*comment to commit*/
	private void iterativeBlockSwap(int[] arr, int d) {
		
		int i=0,j=d-1,k=d,l=arr.length-1;
		
		while(j-i !=l-k) {
			
			if(j-i<l-k) {
				swap(arr,i,j,l-(j-i),l);
				k=j+1;
				l=l-(j-i)-1;
				
			}
			else {
				swap(arr,i,i+(l-k),k,l);
				i=i+(l-k)+1;
				j=k-1;
			}
		}
		
		swap(arr,i,j,k,l);
	}
	
	private void swap(int[]  arr, int i, int j, int k, int l)  {
		
		for(int m=0;m<=j-i;m++) {
			int temp = arr[i+m];
			arr[i+m]=arr[k+m];
			arr[k+m]=temp;
		}
	}
	
	public static void main(String[] args) {
		ArrayRotation arrayRotation = new ArrayRotation();
		int[] arr = {1,2,3,4,5,6,7,8};
		//arrayRotation.recursiveBlockSwap(arr, 6);
		arrayRotation.iterativeBlockSwap(arr, 6);
		/*
		 * when both subarrays are of equal length then 0(n/2)
		 * if both of them are of unequal lenght then  first 
		 * complexity equal to less of the two and then again complexity decreases to further less of the 
		 * two remaining and hence summation of all these equals to O(n)
		 * 
		 * or calculate number of swaps as size of lesser array is k and larger array is l and their
		 * sum is k+l =n and earlier there will be k swaps (as k is lesser than l ) and similarly find swaps
		 * in recursive calls that's it they will amount to n*/
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
