
public class FindCeilingInSortedArray {

	public int ceiling(int[] arr, int k) {
		if(k<=arr[0]) {
			return 0;
		}
		
		if(k>arr[arr.length-1]) {
			return -1;
		}
		
		int l=0,r=arr.length-1;
		
		while(l<=r) {
			int mid = l+ (r-l)/2;
			
			if(arr[mid] == k) {
				return mid;
			}
			
			else if(arr[mid] < k) {
				if(mid+1 >=r && arr[mid+1] > k) {
					return mid+1;
				} else {
					l=mid+1;
				}
			}
			else {
				if(mid-1>=l && arr[mid-1] < k) {
					return mid;
				} else {
					r=mid-1;
				}
			}
		}
		
		return -1;
	}
	
	public int floor(int[] arr, int k) {
		if(k < arr[0]) {
			return -1;
		}
		
		if(k >=arr[arr.length-1]) {
			return arr.length-1;
		}
		
		int l=0,r=arr.length-1;
		
		while(l<=r) {
			int mid = l+(r-l)/2;
			
			if(arr[mid]==k) {
				return mid;
			}
			
			if(arr[mid] < k) {
				if(mid+1>=r && arr[mid+1] > k) {
					return mid;
				} else {
					l=mid+1;
				}
			}
			else {
				if(mid-1>=l && arr[mid-1] < k) {
					return mid-1;
				}
				else {
					r=mid-1;
				}
			} 
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr ={1, 2, 8, 10, 10, 12, 19};
		
		FindCeilingInSortedArray findCeilingInSortedArray = new FindCeilingInSortedArray();
		System.out.println(arr[findCeilingInSortedArray.ceiling(arr, 5)]);
		System.out.println(arr[findCeilingInSortedArray.floor(arr, 20)]);
	}
}
