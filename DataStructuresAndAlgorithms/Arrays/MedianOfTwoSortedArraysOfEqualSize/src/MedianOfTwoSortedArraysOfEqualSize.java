
public class MedianOfTwoSortedArraysOfEqualSize {

	public int median(int[] arr1, int start1,int[] arr2, int start2, int n) {
		
		if(n<=0) {
			return -1;
		}
		
		if(n==1) {
			return(arr1[start1] + arr2[start2])/2;
		}
		
		if(n==2) {
				return (Math.max(arr1[start1],arr2[start2]) + Math.min(arr1[start1+1], arr2[start2+1]))/2;																									
		}
		
		int m1 = median(arr1,start1,n);
		int m2 = median(arr2,start2,n);
		
		if(m1==m2) {
			return m1;
		}
		
		else if(m1 < m2) {
			if(n%2==0) {
				return median(arr1,start1+n/2-1,arr2,start2,n/2+1);
			} else {
				return median(arr1,start1+n/2,arr2,start2,n/2+1);
			}
		}
		else {
			if(n%2==0) {
				return median(arr1,start1,arr2,start2+n/2-1,n/2+1);
			} else {
				return median(arr1,start1,arr2,start2+n/2,n/2+1);
			}
		}
		
	}
	
	private int median(int[] arr, int start, int n) {
		if(n%2==0) {
			return (arr[start+n/2-1]+arr[start+n/2])/2;
		} else {
			return arr[start+n/2];
		}
	}
	
	public static void main(String[] args) {
		int ar1[] = {1, 2, 3, 6};
	    int ar2[] = {4, 6, 8, 10};
	    
	    MedianOfTwoSortedArraysOfEqualSize  medianOfTwoSortedArraysOfEqualSize = new MedianOfTwoSortedArraysOfEqualSize();
	    System.out.println(medianOfTwoSortedArraysOfEqualSize.median(ar1, 0, ar2,0,4));
	}
}

