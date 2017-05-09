/*find the number of occurences of a number in sorted array*/
public class OccurencesInSortedArray {

	public int number(int[] arr, int k) {
		int first = first(arr,k);
		int last = last(arr,k);
		if(first!=-1 && last!=-1) {
			return last-first+1;
		}
		
		return 0;
	}
	
	public int first(int[] arr, int k) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = low +(high-low)/2;
			
			if(k==arr[mid]) {
				if(mid==low){
					return mid;
				}
				
				else if(arr[mid-1]<arr[mid]) {
					return mid;
				}
				else {
					high=mid-1;
				}
			}
			
			else if(k < arr[mid]) {
				high = mid-1;
			}
			else {
				low=mid+1;
			}
		}
		
		return -1;
	}
	
	public int last(int[] arr,int k) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <=high) {
			int mid = low + (high-low)/2;
			
			if(arr[mid]==k) {
				
				if(mid==high) {
					return mid;
				}
				else if(arr[mid+1] > arr[mid]) {
					return mid;
				}
				else {
					low = mid+1;
				}
			}
			
			else if(arr[mid] > k) {
				high = mid-1;
			} 
			else {
				low = mid+1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 3, 3, 3};
		
		OccurencesInSortedArray occurencesInSortedArray = new OccurencesInSortedArray();
		System.out.println(occurencesInSortedArray.number(arr, 4));
	}
}
