
public class SearchInRotatedSortedArray {

	public int search(int[] array, int key) {
		
		int start = 0;
		int end = array.length-1;
		
		while(start <=end) {
			int mid = start + (end-start)/2;
			
			if(key==array[mid]) {
				return mid;
			}
			/*checking if first half is sorted*/
			else if(array[mid]>array[start]) {
				if(key >= array[start] && key <array[mid]) {
					end = mid-1;
				} else {
					start = mid+1;
				}
			}
			
			/*if first half is not sorted then second half is definitely
			 * sorted*/
			else{
				if(key > array[mid] && key <=array[end]) {
					start = mid+1;
				} else {
					end = mid-1;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
		int[] arr = {3,4,5,6,8,0,1,2};
		System.out.println(searchInRotatedSortedArray.search(arr,11));
	}
}
