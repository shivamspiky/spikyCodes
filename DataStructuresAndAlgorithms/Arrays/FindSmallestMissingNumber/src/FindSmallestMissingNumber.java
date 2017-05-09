
public class FindSmallestMissingNumber {

	public int smallest(int[] arr) {
		return smallest(arr,0,arr.length-1);
	}
	
	private int smallest(int[] arr, int start, int end) {
		
		while(start<=end) {
			if(start!=arr[start]) {
				return start;
			}
			int mid = start + (end-start)/2;
			
			if(mid==arr[mid]) {
				start=mid+1;
			} else {
				end= mid-1;
			}
		}
		
		return arr[end]+1;
	}
	
	public static void main(String[] args) {
		FindSmallestMissingNumber findSmallestMissingNumber = new FindSmallestMissingNumber();
		
		int[] arr={0, 1, 2, 3, 4, 5, 6, 7, 10};
		System.out.println(findSmallestMissingNumber.smallest(arr));
	}
}
