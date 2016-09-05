package com.queue.maxsuminslidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumSumInSlidingWindow {
	
	public int[] slidingWindow(int[] arr, int w){
		
		Deque<Integer> deque = new LinkedList<Integer>();
		int [] result = new int[arr.length-w+1];
		int i;
		for(i=0;i<w ;i++){
			while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()]){
				deque.removeLast();
			}
			deque.addLast(i);
		}
		
		for(i=w; i<arr.length ;i++){
			result[i-w] = arr[deque.peekFirst()];
			while(!deque.isEmpty() && deque.peekFirst()<=i-w){
				deque.removeFirst();
			}
			while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()]){
				deque.removeLast();
			}
			deque.addLast(i);
		}
		
		result[arr.length-w] = arr[deque.peekFirst()];
		
		return result;
	}

	public static void main(String[] args){
		MaximumSumInSlidingWindow maximumSumInSlidingWindow = new MaximumSumInSlidingWindow();
		int arr[] = {9,6,11,8,10,5,4,13,93,14};
		int[] result = maximumSumInSlidingWindow.slidingWindow(arr, 4);
		
		for(int i=0;i<result.length ;i++){
			System.out.println(result[i]);
		}
	}
}
