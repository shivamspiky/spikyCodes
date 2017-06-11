
public class IntersectionOfLinkedList {

	public LinkedNode getIntersection(LinkedNode head1, LinkedNode head2) {
		
		if(head1==null || head2==null) {
			return null;
		}
		
		int size1=size(head1);
		int size2=size(head2);
		
		if(size1>size2) {
			int diff = size1-size2;
			
			while(diff!=0) {
				diff--;
				head1=head1.next;
			}
		}else {
			int diff = size2-size1;
			while(diff!=0) {
				diff--;
				head2=head2.next;
			}
		}
		
		while(head1!=null && head2!=null && head1!=head2) {
			head1=head1.next;
			head2=head2.next;
		}
		
		return head1;
		
	}
	
	public int size(LinkedNode head) {
		
		int size =0;
		while(head!=null) {
			size++;
			head=head.next;
		}
		
		return size;
	}
	
	public static void main(String[] args) {
		LinkedNode node1=new LinkedNode(1);
		LinkedNode node2=new LinkedNode(2);
		LinkedNode node3=new LinkedNode(3);
		LinkedNode node4 = new LinkedNode(4);
		LinkedNode node5 = new LinkedNode(5);
		LinkedNode node6 = new LinkedNode (6);
		LinkedNode node7 = new LinkedNode (7);
		
		LinkedNode head1=node1;
		head1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
		LinkedNode head2=node6;
		node6.next=node7;
		node7.next=node3;
		
		
		IntersectionOfLinkedList intersectionOfLinkedList = new IntersectionOfLinkedList();
		System.out.println(intersectionOfLinkedList.getIntersection(head1, head2).data);
	}
}

class LinkedNode {
	
	int data;
	LinkedNode next;
	
	public LinkedNode(int data){
		this.data = data;
		
	}
}
