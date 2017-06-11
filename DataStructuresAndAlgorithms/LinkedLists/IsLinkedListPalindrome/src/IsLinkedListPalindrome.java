import java.util.Stack;


public class IsLinkedListPalindrome {

	public boolean isPalindromeStack(LinkedNode head) {
		
		Stack<LinkedNode> stack = new Stack<LinkedNode>();
		LinkedNode temp = head;
		while(temp!=null) {
			stack.push(temp);
			temp=temp.next;
		}
		temp = head;
		while(!stack.isEmpty()) {
			if(stack.pop().data != temp.data) {
				return false;
			}
			
			temp=temp.next;
		}
		
		return true;
	}
	
	public boolean isPalindromeRecursion(LinkedNode head) {
		
		if(head.next==null) {
			return true;
		}
		
		Head headWrapper = new Head();
		headWrapper.head=head;
		return isPalindromeRecursionUtil(headWrapper, head);

		 
	}
	
	private boolean isPalindromeRecursionUtil(Head headWrapper, LinkedNode tail) {
		
		if(tail.next==null) {
			if(tail.data ==headWrapper.head.data) {
				headWrapper.head=headWrapper.head.next;
				return true;
			} 
			return false;
		}
		
		if(isPalindromeRecursionUtil(headWrapper,tail.next)) {
			if(headWrapper.head.data == tail.data) {
				headWrapper.head = headWrapper.head.next;
				return true;
			}
			return false;
		}
		return false;
	}
	
	public boolean isPalindromeReverse(LinkedNode head) {
		
		LinkedNode middle = getMiddle(head);
		LinkedNode reverseHead = reverse(middle.next);
		boolean isPal = compare(head,reverseHead);
		middle.next = reverse(reverseHead);
		return isPal;
	}
	
	private boolean compare(LinkedNode head1, LinkedNode head2) {
		
		while(head1!=null && head2!=null) {
			if(head1.data!=head2.data) {
				return false;
			}
			
			head1=head1.next;
			head2=head2.next;
		}
		
		return true;
	}
	
	private LinkedNode getMiddle(LinkedNode head) {
		
		LinkedNode slow = head;
		LinkedNode fast = head;
		
		while(fast!=null && fast.next !=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	private LinkedNode reverse(LinkedNode head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		LinkedNode prev = null;
		LinkedNode current = head;
		LinkedNode next = head.next;
		
		while(current!=null) {
			current.next = prev;
			prev = current;
			current = next;
			if(next!=null) {
				next = next.next;
			}
		}
		return prev;
	}
		
	public static void main(String[] args) {
		IsLinkedListPalindrome isLinkedListPalindrome = new IsLinkedListPalindrome();
		LinkedNode head = new LinkedNode(1);
		head.next=new LinkedNode(2);
		head.next.next = new LinkedNode(3);
		head.next.next.next=new LinkedNode(3);
		head.next.next.next.next=new LinkedNode(2);
		head.next.next.next.next.next=new LinkedNode(1);
		
		System.out.println(isLinkedListPalindrome.isPalindromeStack(head));
		System.out.println(isLinkedListPalindrome.isPalindromeRecursion(head));
		System.out.println(isLinkedListPalindrome.isPalindromeReverse(head));
		
	}
}

class LinkedNode {
	int data;
	LinkedNode next;
	
	public LinkedNode(int data) {
		this.data = data;
	}
}

class Head {
	
	LinkedNode head;
}
