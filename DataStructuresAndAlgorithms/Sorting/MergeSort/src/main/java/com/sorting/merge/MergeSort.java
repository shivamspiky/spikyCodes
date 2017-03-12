package com.sorting.merge;

public class MergeSort {

	public void sort(int[] arr, int start, int end) {

		if (start < end) {

			int mid = start + (end - start) / 2;
			sort(arr,start,mid);
			sort(arr,mid+1,end);
			merge(arr, start, end, mid);
		}
	}

	private void merge(int[] arr, int start, int end, int mid) {

		int[] leftArray= new int[mid-start+1];
		int[] rightArray = new int[end-mid];
		
		for(int i=0,j=start;i<leftArray.length && j<=mid;i++,j++) {
			leftArray[i]=arr[j];
		}
		
		for(int i=0,j=mid+1;i<rightArray.length && j<=end;i++,j++) {
			rightArray[i]=arr[j];
		}
		
		int i=0;
		int j=0;
		int k=start;
		while (i < leftArray.length && j < rightArray.length && k <=end) {

			if (leftArray[i] <= rightArray[j]) {

				arr[k] = leftArray[i];
				k++;
				i++;
			} else {

				arr[k] = rightArray[j];
				k++;
				j++;
			}
		}

		if (j >= rightArray.length) {

			while (i < leftArray.length && k <=end) {
				arr[k] =leftArray[i];
				k++;
				i++;
			}
		} else if (i >= leftArray.length) {

			while (j < rightArray.length && k <= end) {
				arr[k] = rightArray[j];
				k++;
				j++;
			}
		}
	}

}
