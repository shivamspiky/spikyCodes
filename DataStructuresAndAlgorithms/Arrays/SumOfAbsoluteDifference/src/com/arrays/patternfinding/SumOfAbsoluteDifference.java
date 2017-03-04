package com.arrays.patternfinding;

import java.util.Arrays;

public class SumOfAbsoluteDifference {

	public int sum(int[] array) {
		
		Arrays.sort(array);
		int sum =0;
		for(int i=0;i< array.length;i++) {
			sum += i*array[i];
			sum -= (array.length-i-1)*array[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		SumOfAbsoluteDifference sumOfAbsoluteDifference = new SumOfAbsoluteDifference();
		int[] array = {1, 8, 9, 15, 16};
		int sum = sumOfAbsoluteDifference.sum(array);
		System.out.println(sum);
	}
}
