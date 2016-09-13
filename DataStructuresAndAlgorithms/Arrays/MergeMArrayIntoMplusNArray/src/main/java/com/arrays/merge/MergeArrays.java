package com.arrays.merge;

public class MergeArrays {
	
	public void merge(int[] arr1,int arr2[]){
		int i;
		int index1 = arr1.length -1;
		int index2 = arr2.length - arr1.length -1;
		for(i = arr2.length -1 ; i>=0 && index1>=0 && index2>=0;i --){
			
			if(arr1[index1] > arr2[index2]){
				arr2[i] = arr1[index1--];
			}else{
				arr2[i] = arr2[index2--];
			}
		}
		
		if(index2 < 0){
			for(;i >=0 ;i --){
				arr2[i] = arr1[index1--];
			}
		}
	}
	
	public static void main(String args[]){
		int arr1[] = {11,13,14,16};
		int arr2[] = new int[8];
		arr2[0] = 2;
		arr2[1] = 5;
		arr2[2] = 8;
		arr2[3] = 11;
		
		MergeArrays mergeArrays = new MergeArrays();
		
		mergeArrays.merge(arr1, arr2);
	
		for(int i = 0;i < arr2.length ;i ++){
			System.out.println(arr2[i]);
		}
	}
}
