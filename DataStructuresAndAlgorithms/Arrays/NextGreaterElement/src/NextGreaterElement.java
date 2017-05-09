import java.util.Stack;


public class NextGreaterElement {

	public void next(int[] arr) {
		
		if(arr==null) {
			return;
		}
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			
			int element = stack.pop();
			
			while(element < arr[i]) {
				System.out.println("Next Greater Element of " + element + " is " + arr[i]);
				
				if(!stack.isEmpty()) {
					element = stack.pop();
				} else {
					break;
				}
			}
			
			if(element >= arr[i]) {
				stack.push(element);
			}
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println("Next Greater Element of " + stack.pop() + " is " + -1);
		}
	}
	
	public static void main(String[] args) {
		NextGreaterElement nextGreaterElement = new NextGreaterElement();
		int[] arr = {3,3,3,6,4,5,9,8,7,8};
		nextGreaterElement.next(arr);
	}
}
