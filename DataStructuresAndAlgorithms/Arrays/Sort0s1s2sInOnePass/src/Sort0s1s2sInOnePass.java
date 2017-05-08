public class Sort0s1s2sInOnePass {
	/*similar to dutch national flag problem*/
	public void sort(int[] arr) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high) {
			
			if(arr[mid]==0) {
				swap(arr,mid,low);
				
				low++;
				mid++;
			}
			
			else if(arr[mid]==1) {
				mid++;
			}
			
			else if(arr[mid]==2) {
				swap(arr,mid,high);
				high--;
			}
		}
	}
	
	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		Sort0s1s2sInOnePass sort0s1s2sInOnePass = new Sort0s1s2sInOnePass();
		sort0s1s2sInOnePass.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}