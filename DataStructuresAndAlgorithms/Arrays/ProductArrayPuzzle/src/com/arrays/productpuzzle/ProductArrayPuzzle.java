package com.arrays.productpuzzle;

public class ProductArrayPuzzle {
	
	public int[] puzzle(int[] arr){
		
		int[] leftarr= new int[arr.length];
		int[] rightarr = new int[arr.length];
		int temp = 1;
		for(int i=0;i<arr.length;i++){
			
			leftarr[i]= temp*arr[i];
			temp = temp*arr[i];
		}
		temp=1;
		for(int i=arr.length-1;i>=0;i--){
			
			rightarr[i]= temp*arr[i];
			temp = temp*arr[i];
		}
		int[] result = new int[arr.length];
		result[0]=rightarr[1];
		result[arr.length-1]=leftarr[arr.length-2];
		for(int i= 1;i < arr.length-1;i++){
			result[i]= leftarr[i-1]*rightarr[i+1];
		}
		return result;
	}
	
	public static void main(String[] args){
		int arr[] = {10, 3, 5, 6, 2};
		ProductArrayPuzzle productArrayPuzzle = new ProductArrayPuzzle();
		int result[]=productArrayPuzzle.puzzle(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(result[i]);
		}
		
	}
}
