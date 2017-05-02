

public class MergeTwoSortedLinkedLists {

	public ListNode merge(ListNode head1, ListNode head2) {
		
		if(head1==null && head2==null) {
			return null;
		}
		
		if(head1==null) {
			return head2;
		}
		
		if(head2==null) {
			return head1;
		}
		ListNode head=null;
		if(head1.data < head2.data) {
			head = head1;
			head1=head1.next;
		} else{
			head = head2;
			head2=head2.next;
		}
		
		ListNode temp = head;
		
		while(head1!=null && head2!=null) {
			
			if(head1.data < head2.data) {
				temp.next=head1;
				head1=head1.next;
			} 
			else{
				temp.next=head2;
				head2=head2.next;
			}
			
			temp=temp.next;
		}
		
		if(head1==null) {
			temp.next=head2;
		}
		else if(head2==null) {
			temp.next=head1;
		}
		
		return head;
	}
	
	public ListNode mergeRec(ListNode head1, ListNode head2) {
		
		if(head1==null && head2==null) {
			return null;
		}
		
		if(head1==null) {
			return head2;
		}
		
		if(head2==null) {
			return head1;
		}
		
		if(head1.data < head2.data) {
			head1.next = mergeRec(head1.next,head2);
			return head1;
		}
		
		else {
			head2.next = mergeRec(head1,head2.next);
			return head2;
		}
	}
	
	private void print(ListNode head) {
		
		while(head!=null) {
			System.out.print(head.data + "\t");
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		ListNode node = new ListNode(5);
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(15);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(20);
		
		node.next=node1;
		node1.next=node2;
		
		node3.next=node4;
		node4.next=node5;
		
		MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();
		ListNode head = mergeTwoSortedLinkedLists.mergeRec(node, node3);
		mergeTwoSortedLinkedLists.print(head);
	}
}


class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode(int data) {
		this.data = data;
	}
}
