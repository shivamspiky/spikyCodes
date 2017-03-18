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
	
	public void repeatingElementsBits(int[] arr) {
		
		int xor=0;
		
		for(int i=0;i<arr.length;i++) {
			xor^=arr[i];
		}
		
		for(int i=1;i<arr.length-1;i++) {
			xor^=i;
		}
		
		int set_bit_number = xor^~(xor-1);
		int k =0,l=0;
		for(int i=0;i<arr.length;i++) {
			if((set_bit_number & arr[i])!=0) {
				k^=arr[i];
			} else {
				l^=arr[i];
			}
		}
		
		for(int i=1;i<arr.length-1;i++) {
			if((set_bit_number & i)!=0) {
				k^=i;
			} else {
				l^=i;
			}
		}
		
		System.out.println("Repeating elements are " + k + " " + l);
	}
	
	public static void main(String[] args) {
		TwoRepeatingElements twoRepeatingElements = new TwoRepeatingElements();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		twoRepeatingElements.repeatingElementsBits(arr);
	}
}
