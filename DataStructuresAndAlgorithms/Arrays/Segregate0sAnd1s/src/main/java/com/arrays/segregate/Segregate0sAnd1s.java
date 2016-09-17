package com.arrays.segregate;

public class Segregate0sAnd1s {
	public void segregate(int[] arr) {
		int i = -1;
		for(int j =0;j< arr.length ; j++){
			
			if(arr[j]==0){
				int temp = arr[++i];
				arr[i] = 0;
				arr[j] = temp;
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr= {0, 1, 0, 1, 1, 1};
		Segregate0sAnd1s segregate0sAnd1s = new Segregate0sAnd1s();
		segregate0sAnd1s.segregate(arr);
		for(int i=0; i< arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
