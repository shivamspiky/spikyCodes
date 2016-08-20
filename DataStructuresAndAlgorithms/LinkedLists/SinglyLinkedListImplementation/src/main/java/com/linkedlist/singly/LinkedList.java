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

	public void print() {

		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
}
