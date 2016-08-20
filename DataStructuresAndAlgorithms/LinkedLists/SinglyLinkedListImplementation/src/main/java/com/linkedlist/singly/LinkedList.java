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
}
