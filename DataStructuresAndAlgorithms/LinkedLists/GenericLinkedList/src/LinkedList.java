
public class LinkedList<E> {

	ListNode<E> head;
	int size;
	
	public LinkedList() {
		this.head = null;
		size=0;
	}
}

class ListNode<E> {
	public E data;
	public ListNode<E> next;
	
	public ListNode(E data) {
		this.data = data;
	}
}
