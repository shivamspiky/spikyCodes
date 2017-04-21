
public class ReverseLinkedList {

	public LinkedNode recursiveReverse(LinkedNode head) {
		if(head == null || head.getNext() == null) {
			return head;
		}
		
		LinkedNode temp = recursiveReverse(head.getNext());
		
		head.getNext().setNext(head);
		head.setNext(null);
		return temp;
	} 
	
	
	public static void main(String[] args) {
		LinkedNode head = new LinkedNode(3);
		LinkedNode node1 = new LinkedNode(5);
		LinkedNode node2 = new LinkedNode(8);
		LinkedNode node3 = new LinkedNode(5);
		LinkedNode node4 = new LinkedNode(10);
		LinkedNode node5 = new LinkedNode(2);
		LinkedNode node6 = new LinkedNode(1);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		LinkedNode reverseHead = reverseLinkedList.recursiveReverse(head);
		while(reverseHead!=null) {
			System.out.print(reverseHead.getData() + "\t");
			reverseHead=reverseHead.getNext();
		}
	}
	
}

class LinkedNode {
	private int data;
	private LinkedNode next;
	
	public LinkedNode(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public LinkedNode getNext(){
		return this.next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(LinkedNode next) {
		this.next = next;
	}
}
