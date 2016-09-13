package com.arrays.majorityelement;

public class MajorityElement {

	public int findCandidate(int[] arr){
		int num=1;
		int maj = 0;
		for(int i=1 ; i < arr.length ;i ++){
			
			if(arr[i] == arr[maj]){
				num ++;
				
			}else{
				num --;
				if(num == 0){
					num = 1;
					maj = i;
				}
			}
		}
		
		return arr[maj];
		
	}
	
	public boolean isMajority(int[] arr, int cand){
		int num = 0;
		for(int i = 0;i< arr.length ;i ++){
			if(arr[i] == cand){
				num ++;
			}
			
			
		}
		if(num > arr.length/2){
			return true;
		}else{
			return false;
		}
		
	}
	public static void main(String[] args){
		int[] arr = {4, 3, 3, 4,4,4};
		
		MajorityElement majorityElement = new MajorityElement();
		int cand = majorityElement.findCandidate(arr);
		
		if(majorityElement.isMajority(arr, cand)){
			System.out.println(cand);
		}else{
			System.out.println("NONE");
		}
	}
}
