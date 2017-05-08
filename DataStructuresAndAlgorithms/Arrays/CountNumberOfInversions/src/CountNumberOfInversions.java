
public class CountNumberOfInversions {

	public int count(int[] arr) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public int sortCount(int[] arr, int start, int end) {

		if (start < end) {

			int mid = start + (end - start) / 2;
			int lCount =sortCount(arr,start,mid);
			int rCount = sortCount(arr,mid+1,end);
			int mCount = mergeCount(arr, start, end, mid);
			return lCount+rCount+mCount;
		}
		return 0;
	}

	private int mergeCount(int[] arr, int start, int end, int mid) {

		int count=0;
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
				count+=leftArray.length-j;
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
		
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {6,4,2,1,3,5};
		CountNumberOfInversions countNumberOfInversions = new CountNumberOfInversions();
		System.out.println(countNumberOfInversions.sortCount(arr,0,arr.length-1));
	}
}
