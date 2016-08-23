package com.linkedlist.circular;

public class CircularLinkedList {

	private CLLNode head, head1, head2;

	public CircularLinkedList() {
		head = null;
	}

	public CLLNode getHead() {
		return head;
	}

	public void setHead(CLLNode head) {
		this.head = head;
	}
	
	public CLLNode getHead1() {
		return head1;
	}

	public void setHead1(CLLNode head) {
		this.head1 = head;
	}
	
	public CLLNode getHead2() {
		return head2;
	}

	public void setHead2(CLLNode head) {
		this.head2 = head;
	}

	public void add(int data) {
		CLLNode node = new CLLNode(data);

		if (head == null) {
			head = node;
			return;
		}

		CLLNode temp = head;
		while (temp.getNext() != head) {
			temp = temp.getNext();
		}

		temp.setNext(node);
		node.setNext(head);
		head = node;

	}

	public void printList(CLLNode head) {
		if (head == null) {
			return;
		}
		CLLNode node = head;

		do {
			System.out.println(node.getData());
			node = node.getNext();
		} while (node != head);
	}

	public void splitCircularLinkedList() {

		if (head == null || head.getNext() == head) {
			return;
		}
		CLLNode slow = head;
		CLLNode fast = head;

		while (fast.getNext() != head && fast.getNext().getNext() != head) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}

		if (fast.getNext() != head) {
			fast = fast.getNext();
		}

		head1 = head;
		head2 = slow.getNext();

		slow.setNext(head1);
		fast.setNext(head2);

	}
	
	public static void main(String args[]){
		
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		
		circularLinkedList.add(1);
		circularLinkedList.add(2);
		circularLinkedList.add(3);
		circularLinkedList.add(4);
		circularLinkedList.add(5);
		circularLinkedList.add(6);
		circularLinkedList.add(7);
		
		circularLinkedList.printList(circularLinkedList.getHead());
		
		circularLinkedList.splitCircularLinkedList();
		
		System.out.println("First Halve : ");
		circularLinkedList.printList(circularLinkedList.getHead1());
		System.out.println("Second Halve : ");
		circularLinkedList.printList(circularLinkedList.getHead2());
	}

}
