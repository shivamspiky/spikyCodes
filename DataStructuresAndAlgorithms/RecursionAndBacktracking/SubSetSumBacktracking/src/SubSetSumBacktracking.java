import java.util.ArrayList;
import java.util.List;

public class SubSetSumBacktracking {
	
	public void subSetSum(int[] arr, int k) {
		List<Integer> list = new ArrayList<Integer>();
		if(subSetSumUtil(arr,0,k,list)) {
			printList(list);
		}else{
			System.out.println("No such subset exists");
		}
	}
	
	private boolean subSetSumUtil(int[] arr, int index, int k, List<Integer> list) {
		if(k==0) {
			return true;
		}
	/*can be optimized if we sort the input array and then in test condition of for loop
	 * also check whether current element is smaller than or equal to k because elements 
	 * after current element is definitely going to greater than k if current element is
	 * greater than k*/
		for(int i=index;i<arr.length;i++) {
			if(arr[i] <=k){
				list.add(arr[i]);
				if(subSetSumUtil(arr,i+1,k-arr[i],list)){
					return true;
				}
				list.remove(list.size()-1);
			}
			
		}
		return false;
	}
	
	private void printList(List<Integer>  list) {
		for(int a : list) {
			System.out.print(a+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SubSetSumBacktracking subSetSumBacktracking = new SubSetSumBacktracking();
		int[] arr = {10, 7, 5, 18, 12, 20, 15};
		subSetSumBacktracking.subSetSum(arr, 35);
	}
}
