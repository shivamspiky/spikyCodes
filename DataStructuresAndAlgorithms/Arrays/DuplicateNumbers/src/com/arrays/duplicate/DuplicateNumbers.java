package com.arrays.duplicate;

public class DuplicateNumbers {
	public void duplicateNumbers(int[] arr){
		for(int i = 0;i<arr.length;i++){
			if(arr[Math.abs(arr[i])] < 0){
				System.out.println(Math.abs(arr[i]));
			}else{
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}
		}
	}
	
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 1, 3, 6, 6};
		DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
		duplicateNumbers.duplicateNumbers(arr);
	}
}
