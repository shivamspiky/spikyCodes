
public class LinkedNode {

	private int data;
	private LinkedNode next;
	
	public LinkedNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return this.data;
		
	}
	
	
	public LinkedNode getNext() {
		return this.next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(LinkedNode next) {
		this.next = next;
	}
}
