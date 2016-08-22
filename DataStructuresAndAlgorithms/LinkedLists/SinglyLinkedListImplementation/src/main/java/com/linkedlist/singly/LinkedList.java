package com.linkedlist.singly;

public class LinkedList {

	private int length;
	private ListNode head;

	public LinkedList() {
		this.length = 0;
		this.head = null;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public ListNode getHead() {
		return this.head;
	}

	public void addBeginning(ListNode node) {

		if (head == null) {
			head = node;
			length++;
			return;
		}

		node.setNext(head);
		head = node;
		length++;
	}

	public void print(ListNode head) {

		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	public void reverseLinkedListRecursive(ListNode current, ListNode prev){
		
		if(current.getNext()!=null){
		
		ListNode next = current.getNext();
		current.setNext(prev);
		reverseLinkedListRecursive(next, current);
		
		}else{
			current.setNext(prev);
			this.head = current;
		}
	}
	
	public void displayInReverseOrder(ListNode current){
		
		if(current == null){
			return;
		}
		displayInReverseOrder(current.getNext());
		System.out.println(current.getData());
	}
	
	public ListNode pairWiseReverseRecursive(ListNode head){
		if(head !=null && head.getNext() !=null){
			ListNode temp = head.getNext().getNext();
			head.getNext().setNext(head);
			head= head.getNext();
			head.getNext().setNext(pairWiseReverseRecursive(temp));
		}
		return head;
	}
	
	public ListNode pairwiseReverseIterative(ListNode head){
		if(head == null || head.getNext() == null){
			return head;
		}
		
		ListNode temp = head.getNext().getNext();
		head.getNext().setNext(head);
		head=head.getNext();
		head.getNext().setNext(temp);
		ListNode prev = head.getNext();
		ListNode current= head.getNext().getNext();
		
		while(current!=null && current.getNext()!=null){
			temp = current.getNext().getNext();
			current.getNext().setNext(current);
			current=current.getNext();
			current.getNext().setNext(temp);
			prev.setNext(current);
			prev=current.getNext();
			current=current.getNext().getNext();
			
		}
		return head;
	}
}
