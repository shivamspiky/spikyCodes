package com.arrays.tworepeatingelements;

public class TwoRepeatingElements {

	public void repeatingElements(int[] arr) {
		int arr_len = arr.length;
		
		for(int i=0; i< arr.length;i++) {
			if(arr[Math.abs(arr[i])]<0) {
				System.out.println(Math.abs(arr[i]));
			}else {
				arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
			}
		}
	}
	
	public static void main(String[] args) {
		TwoRepeatingElements twoRepeatingElements = new TwoRepeatingElements();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		twoRepeatingElements.repeatingElements(arr);
	}
}
