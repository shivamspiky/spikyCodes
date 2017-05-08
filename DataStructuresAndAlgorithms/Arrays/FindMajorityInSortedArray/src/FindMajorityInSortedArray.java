
public class FindMajorityInSortedArray {

	public int majority(int[] arr) {
		
		int mid = (arr.length-1)/2;
		int element = arr[mid];
		
		int leftIndex = binarySearch(arr,0,mid-1,element);
		int rightIndex = binarySearch(arr,mid+1,arr.length-1,element);
		
		if(rightIndex!=-1 &&  leftIndex!=-1) {
			if(rightIndex-leftIndex+1 > arr.length/2) {
				return element;
			} else {
				return Integer.MIN_VALUE;
			}
		}
		
		else if(rightIndex!=-1) {
			if(rightIndex-mid +1 > arr.length/2) {
				return element;
			} else {
				return Integer.MIN_VALUE;
			}
		} else {
			if(mid-leftIndex +1 > arr.length/2) {
				return element;
			} else {
				return Integer.MIN_VALUE;
			}
		}
	}
	
	public int binarySearch(int[] arr, int low, int high, int key) {
		
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			} 
			else if(arr[mid] > key) {
				high = mid-1;
			} 
			else { 
				low = mid+1;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,2,3,3,3,3,11};
		
		FindMajorityInSortedArray findMajorityInSortedArray = new FindMajorityInSortedArray();
		System.out.println(findMajorityInSortedArray.majority(arr));
	}
}
