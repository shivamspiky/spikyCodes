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
	
		for(int i=index;i<arr.length && arr[i] <=k;i++) {
			list.add(arr[i]);
			if(subSetSumUtil(arr,i+1,k-arr[i],list)){
				return true;
			}
			list.remove(list.size()-1);
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
