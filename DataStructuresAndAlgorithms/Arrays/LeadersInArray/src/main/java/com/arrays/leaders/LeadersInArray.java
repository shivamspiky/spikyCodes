package com.arrays.leaders;

public class LeadersInArray {

	public void leaders(int[] arr){
		if(arr.length==0){
			return;
		}
		System.out.println(arr[arr.length-1]);
		int latestLeader = arr[arr.length-1];
		for(int i = arr.length-2 ;i >=0 ;i --){
			if(arr[i] > latestLeader){
				System.out.println(arr[i]);
				latestLeader = arr[i];
			}
		}
	}
	
	public static void main(String[] args){
		int arr[] =  {16, 17, 4, 3, 5, 2};
		
		LeadersInArray leadersInArray = new LeadersInArray();
		leadersInArray.leaders(arr);
	}
}
