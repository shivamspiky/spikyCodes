package com.searching.maximumfrequencyelement;

import java.util.HashMap;
import java.util.Map;

public class MaximumFequencyElement {

	public int maxOccuringElement(int[] arr) {

		int i;
		for (i = 0; i < arr.length; i++) {

			arr[arr[i] % arr.length] += arr.length;
		}
		int max = -1;
		int maxElement = -1;
		for (i = 0; i < arr.length; i++) {

			if (arr[i] / arr.length > max) {
				max = arr[i] / arr.length;
				maxElement = i;
			}
		}

		return maxElement;

	}
	
//	public int maxFrequencyElement(int[] arr) {
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		int max_count= Integer.MIN_VALUE;
//	 
//		for(int i=0;i<arr.length;i++) {
//			
//		}
//	}

}
