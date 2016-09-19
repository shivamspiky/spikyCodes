package com.arrays.segregate;

public class SegregateEvenAndOdd {
	public void segregate(int[] arr){
		
		int i=-1;
		for(int j =0; i<arr.length && j< arr.length ;j++){
			if(arr[j]%2==0){
				int temp = arr[++i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr={12, 13, 45, 9, 12, 92, 34};
		SegregateEvenAndOdd segregateEvenAndOdd = new SegregateEvenAndOdd();
		segregateEvenAndOdd.segregate(arr);
		
		for(int i=0;i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
