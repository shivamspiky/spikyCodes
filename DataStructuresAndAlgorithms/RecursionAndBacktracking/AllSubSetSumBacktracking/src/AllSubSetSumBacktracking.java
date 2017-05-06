import java.util.ArrayList;
import java.util.List;


public class AllSubSetSumBacktracking {
	int count=0;
	public void subSetSum(int[] arr, int k) {
		List<Integer> list = new ArrayList<Integer>();
		subSetSumUtil(arr,0,k,list);
		
		if(count==0) {
			System.out.println("No solution exists");
		}
	}
	
	private void subSetSumUtil(int[] arr, int index, int k, List<Integer> list) {
		if(k==0) {
			printList(list);
		}
	
		for(int i=index;i<arr.length && arr[i] <=k;i++) {
			list.add(arr[i]);
			subSetSumUtil(arr,index+1,k-arr[i],list);		
			list.remove(list.size()-1);
		}
		
	}
	
	private void printList(List<Integer>  list) {
		count++;
		System.out.println("Solution #" + count);
		for(int a : list) {
			System.out.print(a+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		AllSubSetSumBacktracking subSetSumBacktracking = new AllSubSetSumBacktracking();
		int[] arr = {10, 7, 5, 18, 12, 20, 15};
		subSetSumBacktracking.subSetSum(arr, 35);
	}
}
