
public class PrintReverseOfLinkedList {

	public void print(LinkedNode head) {
		
		if(head==null ) {
			return;
		}
		
		if(head.next==null) {
			System.out.print(head.data + " ");
			return;
		}
		
		print(head.next);
		System.out.print(head.data + " ");
	}
	
	public static void main(String[] args) {
		PrintReverseOfLinkedList printReverseOfLinkedList = new PrintReverseOfLinkedList();
		
		LinkedNode node1=new LinkedNode(1);
		node1.next = new LinkedNode(2);
		node1.next.next = new LinkedNode(3);
		node1.next.next.next = new LinkedNode(4);
		//node1.next.next.next.next = new LinkedNode(5);
		
		printReverseOfLinkedList.print(node1);
	}
}


class LinkedNode {
	int data;
	LinkedNode next;
	
	public LinkedNode(int data) {
		this.data= data;
	}
}