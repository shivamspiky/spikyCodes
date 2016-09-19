package com.arrays.unionandintersection;

public class UnionAndIntersectionOfTwoElements {

	public void union(int[] arr1, int[] arr2){
		int i,j;
		System.out.println("UNION");
		for(i=0,j=0;i< arr1.length && j< arr2.length ;){
			if(arr1[i] < arr2[j]){
				System.out.print(arr1[i]+" ");
				i++;
			}
			else if(arr1[i] > arr2[j]){
				System.out.print(arr2[j]+" ");
				j++;
			}else{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		
		if(i==arr1.length){
			while(j<arr2.length){
				System.out.print(arr2[j]);
				j++;
			}
		}else{
			while(i<arr1.length){
				System.out.print(arr1[i]);
				i++;
			}
		}
	}
	
	public void intersection(int[] arr1,int[] arr2){
		int i,j;
		System.out.println("\nINTERSECTION");
		for(i=0,j=0;i< arr1.length && j< arr2.length ;){
			if(arr1[i] < arr2[j]){
				i++;
			}
			else if(arr1[i] > arr2[j]){
				j++;
			}else{
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
	}
	
	public static void main(String args[]){
		int[] arr1 = {1, 3, 4, 5, 7};
		int[] arr2 = {2, 3, 5, 6};
		
		UnionAndIntersectionOfTwoElements unionAndIntersectionOfTwoElements = new UnionAndIntersectionOfTwoElements();
		unionAndIntersectionOfTwoElements.union(arr1, arr2);
		unionAndIntersectionOfTwoElements.intersection(arr1, arr2);
	}
}
